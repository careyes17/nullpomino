@echo off
set path=%path%;%systemroot%\SysWOW64
start javaw -cp bin;NullpoMino.jar;lib\log4j-1.2.15.jar;lib\slick.jar;lib\lwjgl.jar;lib\jinput.jar -Djava.library.path=lib mu.nu.nullpo.gui.slick.NullpoMinoSlick
