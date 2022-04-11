NullpoMino �`�ʂ�ۃ~�m�`
Version 7.5.0

�y������ĉ��H�z
Java�ō�����������̃A�N�V�����p�Y���Q�[�����ǂ��ł��B

�y�N�����@�z
����ɂ�Java Runtime Environment��1.5�ȏオ�K�v�ł��Bhttp://www.java.com/ja/download/

�EWindows
�@�@play_swing.bat���_�u���N���b�N�����Swing�o�[�W�������N�����܂��B
�@�@�iOS�ˑ����C�u�������g��Ȃ��݌v�ł��B���������쑬�x��T�E���h�̎��͍Œ�ł��BBGM�Đ���W���C�X�e�B�b�N�@�\������܂���B�j
�@�@play_slick.bat�܂���NullpoMino.exe���_�u���N���b�N�����Slick�o�[�W�������N�����܂��B
�@�@�iOpenGL�ɑΉ������r�f�I�J�[�h���K�v�ł��B��������PC�ł̓L�[�{�[�h��F�����܂���B�j
�@�@play_sdl.bat���_�u���N���b�N�����SDL�o�[�W�������N�����܂��B
�@�@�i�قƂ�ǂ�PC��Slick�o�[�W�����������肵�ē��삵�܂��B
�@�@�@�����������_���ɃN���b�V������o�O��A�l�b�g�v���C���Ƀ��������[�N�o�O�Ȃǂ�����܂��B32bit����j

�@�@ruleeditor.bat���_�u���N���b�N����ƃ��[���G�f�B�^���N�����܂��B���[���̍쐬�E�ҏW���ł��܂��B
�@�@sequencer.bat���_�u���N���b�N����ƃV�[�P���X�r���[�A���N�����܂��B���v���C�t�@�C�����J����NEXT�̏��Ԃ��m�F�ł���c�[���ł��B�iZircean����J���j
�@�@musiclisteditor.bat���_�u���N���b�N����ƃ~���[�W�b�N���X�g�G�f�B�^���N�����܂��B���y�̐ݒ肪�ł��܂��B
�@�@netserver.bat���_�u���N���b�N�����NetServer�i�l�b�g�v���C�p�T�[�o�[�j���N�����܂��B
�@�@netadmin.bat���_�u���N���b�N�����NetAdmin�iNetServer�Ǘ��c�[���j���N�����܂��B
�@�@airankstool.bat���_�u���N���b�N�����AI Ranks Tool���N�����܂��BRanksAI�̒�΃t�@�C�����쐬����c�[���ł��B�i��ʂ̃�������K�v�Ƃ��܂��j

�ELinux
�@�@�[���E�B���h�E��NullpoMino������f�B���N�g���i���̃t�@�C��������f�B���N�g���j�܂ňړ�����
�@�@�ȉ��̃R�}���h����͂���Enter�L�[�������Ƃ��Ԃ�N�����܂��B
�@�@(��:�ŏ���chmod�R�}���h�͋N���p�V�F���X�N���v�g�Ɏ��s������^������̂ł��B2��ڂ̋N������͕K�v����܂���B)

�@�@Swing�o�[�W����:
chmod +x play_swing
./play_swing

�@�@Slick�o�[�W����:
chmod +x play_slick
./play_slick
�@�@�܂���
chmod +x NullpoMino
./NullpoMino

�@�@SDL�o�[�W����:
chmod +x play_sdl
./play_sdl

�@�@���[���G�f�B�^:
chmod +x ruleeditor
./ruleeditor

�@�@�V�[�P���X�r���[�A:
chmod +x sequencer
./sequencer

�@�@�~���[�W�b�N���X�g�G�f�B�^:
chmod +x musiclisteditor
./musiclisteditor

�@�@�l�b�g�v���C�p�T�[�o�[:
chmod +x netserver
./netserver

�@�@NetAdmin:
chmod +x netadmin
./netadmin

�@�@AI Ranks Tool:
chmod +x airankstool
./airankstool

�@�@�g�p���Ă���r�f�I�J�[�h��Linux�̃o�[�W�����ɂ���Ă͂��܂������Ȃ���������܂���B

�@�@Swing�o�[�W�����ŗL�̖��:
�@�@�@�����_�ł͂܂Ƃ��ɓ����܂���B

�@�@Slick�o�[�W�����ŗL�̖��:
�@�@�@3D�f�X�N�g�b�v�@�\�iBeryl�Ƃ��j�͖����ɂ��邱�Ƃ��������߂��܂��B
�@�@�@�ꉞx64�ł����삷��悤�ł��B

�@�@�@LWJGL�����SCIM�̃o�O(�������͐���)�̂��߁Aplay_slick�V�F���X�N���v�g�̓Q�[�����N������Ƃ��ɑS�Ă�IME�𖳌������܂��B
�@�@�@�V�F���X�N���v�g���̃R�}���h���C���ŏ���XMODIFIERS=@im=none�́A�g���Ă���IME��SCIM�ȊO�̏ꍇ�͕s�v�ł��B

�@�@�@����SCIM��L���������܂܃Q�[�����v���C�������ꍇ�́A�ȉ��̃R�}���h�������Ă�������(sudo�����s�ł��錠�����K�v�ł�):

sudo chmod go+r /dev/input/*
java -cp bin:NullpoMino.jar:lib/log4j-1.2.15.jar:lib/slick.jar:lib/lwjgl.jar:lib/jorbis-0.0.15.jar:lib/jogg-0.0.7.jar:lib/ibxm.jar:lib/jinput.jar -Djava.library.path=lib mu.nu.nullpo.gui.slick.NullpoMinoSlick -j

�@�@�@�ŏ��̃R�}���h�́A���ׂẴv���O�������L�[�{�[�h���͂𒼐ړǂݎ���悤�ɂ��܂��B
�@�@�@��x���s����ƁA���ɍċN���������̓V���b�g�_�E������܂ōēx���s����K�v�͂���܂���B
�@�@�@2�ڂ̃R�}���h�́A�Q�[����"-j"�I�v�V������t���ċN�����܂��B
�@�@�@�ʏ�A���̃Q�[���̓L�[�{�[�h���͂�LWJGL����ǂݎ�낤�Ƃ��܂����ASCIM�Ƃ͑����������ł��B
�@�@�@���̃I�v�V�������g�p���Ă���ꍇ�A�Q�[���̓L�[�{�[�h���͂��V�X�e�����璼�ړǂݎ��܂��̂ŁASCIM�������Ă����Ȃ����삷��悤�ɂȂ�܂��B
�@�@�@�������ꕔ�F���ł��Ȃ��L�[�i;�Ȃǁj������܂��B

�@�@SDL�o�[�W�����ŗL�̖��:
�@�@�@������Ubuntu 8.04�Ŏ���������ł́A���ꂪLinux�ł͍ł����Ȃ����삵�܂��B
�@�@�@�������ɂ�libsdl���C���X�g�[������Ă���K�v������܂��B
�@�@�@�����ĂȂ��ꍇ�AUbuntu 8.04���ƈȉ��̃R�}���h�ŃC���X�g�[���ł���炵���ł��B
sudo apt-get install libsdl1.2debian
�@�@�@i386�ȊO���Ɠ����Ȃ��悤�ł��B

�EMac OS X
�@�@�����ĂȂ��̂ł悭������܂���(�L�E�ցE�M)
�@�@Slick�o�[�W�����͈ꉞLinux�Ɠ����R�}���h�œ����炵���ł��B
�@�@SDL�o�[�W�����́A�g���Ă郉�C�u�����isdljava�j��Windows�ł�Linux�ł������݂��Ȃ����ߓ����܂���B
�@�@Swing�o�[�W�����͕�����܂���c

�y�V�ѕ��z
�ォ��u���b�N���������Ă��܂��B
�u���b�N�͒n�ʂ⑼�̃u���b�N�̏�ɗ�����܂ŉ�]��������A�ړ���������A����������������ł��܂��B
�u���b�N���n�ʂ⑼�̃u���b�N�̏�ɗ�����ƁA���̃u���b�N���Œ肳��āA�ォ�玟�̃u���b�N���������Ă��܂��B
�u���b�N�������Ɍ��Ԗ������ׂ�i���C�������j�ƁA�u���b�N���������Ƃ��ł��܂��B
��x�ɕ����̃��C�������ƍ����_�ł��B
�u���b�N����܂Őς݂�����A���̃u���b�N�������Ă���Ȃ��Ȃ�ƃQ�[���I�[�o�[�ł��B

�y�{�^���̐����z
UP�F�n�[�h�h���b�v�i�u���b�N����u�ŗ����j�E�J�[�\������Ɉړ�
DOWN�F�\�t�g�h���b�v�i�u���b�N�𑁂������j�E�J�[�\�������Ɉړ�
LEFT�F�u���b�N�����Ɉړ��E�J�[�\���őI�����Ă��鍀�ڂ̒l��1���炷
RIGHT�F�u���b�N���E�Ɉړ��E�J�[�\���őI�����Ă��鍀�ڂ̒l��1���₷
A�F�u���b�N�̉�]�E���j���[���ڂ̌���
B�F�u���b�N�̋t��]�E�L�����Z��
C�F�u���b�N�̉�]
D�F�z�[���h�i�u���b�N���ꎞ�I�ɕۊǂ��āA��Ŏg�����Ƃ��ł��܂��j
E�F�u���b�N��180�x��]
F�F�G���f�B���O������iSPEED MANIA��GARBAGE MANIA���[�h�Ŏg�p�\�j�E�l�b�g�v���C�ŗ��K���[�h���J�n�^�I��
QUIT�F�Q�[�����I������
PAUSE�F�Q�[�����ꎞ��~
GIVEUP�F�^�C�g���ɖ߂�
RETRY�F�Q�[�����ŏ������蒼��
FRAME STEP�F�|�[�Y���ɉ�����1�t���[�������Q�[����i�߂�i�ݒ�ŗL���ɂ��Ă���ꍇ�j
SCREEN SHOT�F�X�N���[���V���b�g��ss�t�H���_�ɕۑ�

�y�L�[�z�u�z
�E���j���[��ʂł̃L�[�z�u
+-------------+------------+------------+------------+
|  �{�^����   |  Blockbox  | Guideline  | NullpoMino |
|             |(�f�t�H���g)|            |  Classic   |
+-------------+------------+------------+------------+
|UP           |Cursor Up   |Cursor Up   |Cursor Up   |
|DOWN         |Cursor Down |Cursor Down |Cursor Down |
|LEFT         |Cursor Left |Cursor Left |Cursor Left |
|RIGHT        |Cursor Right|Cursor Right|Cursor Right|
|A            |Enter       |Enter       |A           |
|B            |Escape      |Escape      |S           |
|C            |A           |C           |D           |
|D            |Space       |Shift       |Z           |
|E            |D           |X           |X           |
|F            |S           |V           |C           |
|QUIT         |F12         |F12         |Escape      |
|PAUSE        |F1          |F1          |F1          |
|GIVEUP       |F11         |F11         |F12         |
|RETRY        |F10         |F10         |F11         |
|FRAME STEP   |N           |N           |N           |
|SCREEN SHOT  |F5          |F5          |F10         |
+-------------+------------+------------+------------+

�E�Q�[�����̃L�[�z�u
+-------------+------------+------------+------------+
|  �{�^����   |  Blockbox  | Guideline  | NullpoMino |
|             |(�f�t�H���g)|            |  Classic   |
+-------------+------------+------------+------------+
|UP           |Cursor Up   |Space       |Cursor Up   |
|DOWN         |Cursor Down |Cursor Down |Cursor Down |
|LEFT         |Cursor Left |Cursor Left |Cursor Left |
|RIGHT        |Cursor Right|Cursor Right|Cursor Right|
|A            |Z           |Z           |A           |
|B            |X           |Cursor Up   |S           |
|C            |A           |C           |D           |
|D            |Space       |Shift       |Z           |
|E            |D           |X           |X           |
|F            |S           |V           |C           |
|QUIT         |F12         |F12         |Escape      |
|PAUSE        |Escape      |Escape      |F1          |
|GIVEUP       |F11         |F11         |F12         |
|RETRY        |F10         |F10         |F11         |
|FRAME STEP   |N           |N           |N           |
|SCREEN SHOT  |F5          |F5          |F10         |
+-------------+------------+------------+------------+

�L�[�z�u�̓^�C�g���́uCONFIG�v�̒��ɂ���u[KEYBOARD SETTING]�v����ύX�ł��܂��B

�y�ݒ�̃��Z�b�g�z
�ݒ�����Z�b�g�������Ƃ��́A�ȉ��̃t�@�C�����폜���Ă��������B
�@Swing�ŁFconfig\setting\swing.cfg
�@Slick�ŁFconfig\setting\slick.cfg
�@SDL�ŁFconfig\setting\sdl.cfg
�@�e�o�[�W�������ʂ̐ݒ�Fconfig\setting\global.cfg
�@�n�C�X�R�A�ȂǁFconfig\setting\mode.cfg

�y�Q�[�����[���z
�I�񂾃Q�[�����[���ɉ����đ��쐫��u���b�N�̌����ڂ��ς��܂��B
CONFIG�̒��ɂ���u[RULE SELECT]�v����g�p���郋�[����ύX�ł��܂��B
�t���̃��[���G�f�B�^���g���ƓƎ��̃��[�����쐬�ł��܂��B

AVALANCHE�@�@�@�@�@�FAVALANCHE�^�C�v�̃��[�h�p�̃��[���ł��B
CLASSIC0 �@�@�@�@�@�F�ǏR����z�[���h���Ȃ��ÓT�I�ȃ��[��(RETRO MANIA���[�h�ɂ�������)
CLASSIC0-68K �@�@�@�FCLASSIC0�ɋt��]���t�������[��
CLASSIC1 �@�@�@�@�@�FNEXT��1�����A�z�[���h�Ȃ��A�n�[�h�h���b�v�Ȃ��A�Ǔo��s�̃��[��
CLASSIC2 �@�@�@�@�@�FCLASSIC1�Ƀn�[�h�h���b�v��ǉ��������[��
CLASSIC3 �@�@�@�@�@�FNEXT��3�A�z�[���h����A�ꕔ�u���b�N��1�񂾂�����ȉ�]���ł���悤�ɂȂ������[��
CLASSIC-EASY-A �@�@�FCLASSIC3��STANDARD�����̂������悤�ȃ��[��
CLASSIC-EASY-A2�@�@�FCLASSIC-EASY-A�̐F�Ⴂ
CLASSIC-EASY-B �@�@�FCLASSIC-EASY-A�̃n�[�h�h���b�v�ƃ\�t�g�h���b�v�̊֌W�𔽑΂ɂ������[��
CLASSIC-EASY-B2�@�@�FCLASSIC-EASY-B�̐F�Ⴂ
CLASSIC-S�@�@�@�@�@�FCLASSIC0�ɕǏR���ǉ��������[��(�������u�ǁv�����R��܂���B���łɒu�����u���b�N�͏R��܂���B)
DTET �@�@�@�@�@�@�@�F�Ɠ��ȉ�]�@���⑀�쐫�������[��
NINTENDO-L �@�@�@�@�F���m�N���̃u���b�N�⋷���t�B�[���h������Ƃ���ÓT�I�ȃ��[��
NINTENDO-L-FAST �@ �FNINTENDO-L�̉��ړ��𑬂���������
NINTENDO-R �@�@�@�@�FNINTENDO-L�����E���ɉ�]���u���b�N���J���[�ȌÓT�I�ȃ��[��(CLASSIC MARATHON���[�h�ɂ�������)
NINTENDO-R-FAST �@ �FNINTENDO-R�̉��ړ��𑬂���������
PHYSICIAN�@�@�@�@�@�FPHYSICIAN�^�C�v�̃��[�h�p�̃��[���ł��B
SPF�@�@�@�@�@�@�@�@�FSPF�^�C�v�̃��[�h�p�̃��[���ł��B
SQUARE�@�@�@�@�@�@ �FSQUARE���[�h�����̃��[���ł��B4x4�̐����`�����Ղ��悤�ȏ��ԂŃu���b�N���o�����܂��B
STANDARD�@�@�@�@�@ �F���S�҂���㋉�҂܂ň����₷�����[���ŁA�Ǔo����\
STANDARD-EXP�@�@�@ �F�n�[�h�h���b�v���g�p���Ă����Œ肹���A�\�t�g�h���b�v���Ƒ��Œ�ɂȂ郋�[��
STANDARD-FAST�@�@�@�FSTANDARD�����f�������삪�\
STANDARD-FAST-B�@�@�FSTANDARD-FAST������s��]���\�����ɂ���
STANDARD-FRIENDS�@ �F���������x���E�o���ʒu�����̃��[����1�}�X��
STANDARD-GIZA�@�@�@�Fhebo-MAI�����̃��[���E��⑬�x���}�����Ă��đΐ�ł͑��x�ł͂Ȃ��헪�������߂���
STANDARD-HARD�@�@�@�FSTANDARD�����������
STANDARD-HARD128�@ �FSTANDARD-HARD�������ȒP�ɂ�������(�u���b�N���n�ʂɒ��n��������128��܂ňړ��E��]�\)
STANDARD-HOLDNEXT�@�Fholdnext�����̃��[���E�I�����W�_������
STANDARD-J�@�@�@�@ �F���������Ȃ�x��
STANDARD-PLUS�@�@�@�FSTANDARD-FAST���x�[�X�ɁA���C���������Ԃ�0�ɂ��ă\�t�g�h���b�v���x���グ�����[��(Blink�����)
STANDARD-SUPER3�@�@�F��]�@����STANDARD�Ɠ����ŕǏR�肪���݂��Ȃ����[��
STANDARD-ZERO�@�@�@�FSTANDARD-PLUS���x�[�X�ɁA��s��]�����E��s�z�[���h�����E�\�t�g�h���b�v���x20G�E���[�v���ړ��������ꂽ���[�� (Wojtek�����)

�y�Q�[�����[�h�z
�EMARATHON
�@�@10���C���������ƂɃ��x�����オ�鏉�S�Ҍ������[�h�ł��B
�@�@�u150���C���ŏI���v�u200���C���ŏI���v�u�����ɑ����v3�̃Q�[���^�C�v��I�ׂ܂��B

�EMARATHON
�@�@�Q�[�����e��MARATHON��200���C���^�C�v�Ƃقړ����ł����A���x��20���N���A����Ɓu�{�[�i�X���x���v(���x��21)�ɓ˓����܂��B
�@�@�{�[�i�X���x���͖����ɑ����܂����A�u�����u���b�N�����܂ɂ����\������܂���B

�EEXTREME
�@�@MARATHON�Ǝ��Ă��邯�ǃu���b�N�̗������x�������������㋉�Ҍ������[�h�ł��B

�ELINE RACE
�@�@�ǂꂾ�������K�胉�C�����������邩�����^�C���A�^�b�N���[�h�ł��B
�@�@�K�胉�C������20���C���E40���C���E100���C����3��ނ���I���\�ł��B

�ESCORE RACE
�@�@�ǂꂾ�������K��X�R�A�ɓ��B�ł��邩�������^�C���A�^�b�N���[�h�ł��B
�@�@�K��X�R�A��10000�_�E25000�_�E30000�_��3��ނ���I���\�ł��B

�EDIG RACE
�@�@�ǂꂾ���������ׂĂ̎ז��u���b�N�������邩�����^�C���A�^�b�N���[�h�ł��B
�@�@�ז��u���b�N�̐���5���C���E10���C���E18���C������I���\�ł��B

�ECOMBO RACE
�@�@�K�胉�C�����������܂łɍő�ŉ��R���{�ł��邩�������܂��B
�@�@�K�胉�C������20���C���E40���C���E100���C���E�G���h���X����I���\�ł��B
�@�@�G���h���X�ł̓R���{���r�؂��܂ŃQ�[���������܂��B

�EULTRA
�@�@�������ԓ��ɂǂꂾ�������̓��_�𓾂��邩�A�܂��͂ǂꂾ�������̃��C���������邩���������[�h�ł��B
�@�@�������Ԃ�1�`5����5��ނ���I���\�ł��B

�ETECHNICIAN
�@�@�ł��邾�������uGOAL�v��0�ɂ��Ď��̃��x���ɐi�ނ��Ƃ��ړI�̃��[�h�ł��B
�@�@���C������������Ȃǂ̍s��������ƁuGOAL�v������A�uGOAL�v�̕\����0�ɂȂ�Ǝ��̃��x���ɐi�߂܂��B
�@�@��x�ɕ����̃��C������������A�A���Ń��C�����������肷��ƁuGOAL�v����������܂��B
�@�@�ړI�␧�����Ԃ��قȂ�5��ނ̃Q�[���^�C�v��I�ׂ܂��B

�@�@LV15-EASY�F ���x��16�ɓ��B����ƃQ�[���N���A�ɂȂ�܂��B
�@�@�@�@�@�@�@�@�Q���ȓ��Ƀ��x���A�b�v����ƃ{�[�i�X���_������܂����A���Ԑ؂�ɂȂ��Ă��y�i���e�B�͂���܂���B
�@�@LV15-HARD�F LV15-EASY�Ǝ��Ă��܂����A�Q���ȓ��Ƀ��x���A�b�v���Ȃ��Ƒ��Q�[���I�[�o�[�ł��B
�@�@10MIN-EASY�F10���ԃv���C���ăX�R�A�������Q�[���^�C�v�ł��B
�@�@�@�@�@�@�@�@�Q���ȓ��Ƀ��x���A�b�v���Ȃ������ꍇ�A�uREGRET�v�ƕ\�������GOAL�����Z�b�g����Ă��܂��܂��B
�@�@10MIN-HARD�F10MIN-EASY�Ƃقړ����ł����A�Q���ȓ��Ƀ��x���A�b�v���Ȃ������ꍇ�͑��Q�[���I�[�o�[�ł��B
�@�@SPECIAL�F�@ ���x���A�b�v���邽�тɐ������Ԃ�30�b���������Q�[���^�C�v�ł��B
�@�@�@�@�@�@�@�@�������x���A�b�v����Ƃ�蒷���v���C�ł���悤�ɂȂ�܂��B

�ESQUARE
�@�@�c4x��4�̃T�C�Y�̐����`������ď����Ă������[�h�ł��B
�@�@2��ވȏ�̃u���b�N���g���Đ����`�����Ƌ�F�A1��ނ̃u���b�N�����Ő����`�����Ƌ��F�ɂȂ�܂��B
�@�@���F�̐����`�������ƁA��F���������Ƃ���2�{�̃{�[�i�X������܂��B
�@�@3��ނ̃Q�[���^�C�v��I�ׂ܂��B
�@�@MARATHON:�@�G���h���X
�@�@SPRINT:�@�@150�_���܂ł̃^�C���A�^�b�N
�@�@ULTRA:�@�@ 3���ԃX�R�A�A�^�b�N
�@�@��{�I�ɂǂ�ȃ��[���ł��ꉞ�V�ׂ܂����A�uSQUARE�v���[�����g���Ɛ����`�����Ղ����ԂŃu���b�N�������Ă��܂��B

�EDIG CHALLENGE
�@�@������ǂ�ǂ񂹂�オ���Ă���ז��u���b�N���Ђ���������Ă������[�h�ł��B����Ԃ����ז��u���b�N�������_�ɂȂ�܂��B
�@�@2��ނ̃Q�[���^�C�v��I�ׂ܂��B
�@�@NORMAL:�@�@�s�[�X��u���܂ł���オ��Ȃ����A1���C�������܂��Ă���
�@�@REALTIME:�@�s�[�X��u���Ȃ��Ă�����オ��

�ERETRO MARATHON
�@�@����CLASSIC MARATHON���[�h�B
�@�@MARATHON�Ƃقړ��l�̃Q�[�����V�ׂ܂����X�s�[�h�̏㏸�͊ɂ₩�ł��B
�@�@�uNINTENDO-R�v���[�����������߂ł��B

�ERETRO MASTERY
�@�@RETRO MARATHON�̏㋉�Ҍ����o�[�W�����ł��B�����ɖ��ʂȏ����������Ȃ������d�v�ɂȂ�܂��B
�@�@�uNINTENDO-R�v���[�����������߂ł��B

�ERETRO MANIA
�@�@MARATHON�Ƃقړ��l�̃Q�[�����V�ׂ܂����A���x���A�b�v�������Ɠ��ŁA4���C�����������΂炭�������Ȃ��ƃ��x�����オ��܂��B
�@�@�uCLASSIC0�v���[�����������߂ł��B

�EGRADE MANIA
�@�@���x��999�ɂȂ�܂łɂł��邾�������i�ʂ�ڎw�����[�h�ł��B
�@�@�i�ʂ͓��_�ɉ����ă����N�A�b�v���܂��B
�@�@���x���̓u���b�N��u��������1�オ��܂����A���x���̖���2����99�̂Ƃ��A����у��x��998�ł̓��C���������Ȃ��Əオ��܂���B
�@�@��Փx�͏��S�Ҍ����ł��B

�EGRADE MANIA 2
�@�@GRADE MANIA������Փx�����������Ҍ������[�h�ł��B
�@�@���̃��[�h�ł͒i�ʂƓ��_�͖��֌W�ł��B

�EGRADE MANIA 3
�@�@GRADE MANIA2��������ɓ�Փx�̍����㋉�Ҍ������[�h�ł��B
�@�@�v���C���[�̘r�O�ɉ����ė������x���ω����Ă��܂��B

�ESCORE ATTACK
�@�@���x��300�ɓ��B����܂łɉ҂������_���������[�h�ł��B
�@�@��Փx�͏��S�Ҍ����ł��B

�ESPEED MANIA
�@�@GRADE MANIA�Ǝ����V�X�e����p�����A�������x�����������Ҍ������[�h�ł��B
�@�@���x��500�ȍ~�ɍs���ɂ͂���Ȃ�̘r�O���K�v�ƂȂ�܂��B

�ESPEED MANIA 2
�@�@SPEED MANIA��傫�������鑬�x�Ńu���b�N���~���Ă���㋉�Ҍ������[�h�ł��B
�@�@���x��500�ɓ��B����Ɖ������N����܂��B

�EGARBAGE MANIA
�@�@���X�D�F�̃u���b�N�������点��オ���Ă��郂�[�h�ł��B
�@�@�㔼�ɂȂ�قǂ���オ��̃y�[�X���オ���Ă��܂��B

�EPHANTOM MANIA
�@�@SPEED MANIA���[�h�Ǝ��Ă��܂����A���̃��[�h�ł͒u�����u���b�N���S�������܂���B
�@�@�u�����u���b�N�̏ꏊ��t�B�[���h�̒n�`���L�����邱�Ƃ��d�v�ƂȂ�܂��B

�EFINAL
�@�@�펯�O�̑��x�Ńu���b�N�������Ă��郂�[�h�ł��B���㋉�Ґ�p�B

�ETIME ATTACK
�@�@�ł��邾������150���C���܂���200���C���������Ƃ��ړI�̃��[�h�ł��B
�@�@�e���x���ɂ͐������Ԃ��ݒ肳��Ă���A���̎��ԓ��Ɏ��̃��x���ɍs���Ȃ��ƃQ�[���I�[�o�[�ɂȂ�܂��B
�@�@10���C���������тɃ��x�����オ��A�������Ԃ��񕜂��܂��B

�@�@150���C���^�C�v(�E�ɍs���قǓ��):
�@�@�@NORMAL��HIGH SPEED 1��HIGH SPEED 2��ANOTHER��ANOTHER2
�@�@200���C���^�C�v(�E�ɍs���قǓ��):
�@�@�@NORMAL 200��ANOTHER 200��BASIC��HELL��HELL-X��VOID

�EPRACTICE
�@�@�D���ȑ��x��ݒ肵�ė��K���ł��郂�[�h�ł��B
�@�@�o������u���b�N�̎�ނ��ݒ�ł��܂��B

�EGEM MANIA
�@�@�t�B�[���h�ɔz�u���ꂽ��΃u���b�N���ł��邾���������ׂď������邱�Ƃ��ړI�̃��[�h�ł��B
�@�@�u�X�e�[�W�^�C���v�Ɓu���~�b�g�^�C���v��2��ނ̐������Ԃ����݂��܂��B
�@�@�X�e�[�W�^�C���͊e�X�e�[�W�̐������ԂŁA�X�e�[�W�J�n����1������n�܂�A0�ɂȂ�Ƌ����I�Ɏ��̃X�e�[�W�֐i�܂���܂��B
�@�@���~�b�g�^�C���̓Q�[���S�̂̐������ԂŁA���ꂪ0�ɂȂ�ƃQ�[���I�[�o�[�ł��B
�@�@���~�b�g�^�C���͊e�X�e�[�W��20�b�ȓ��ɃN���A����Ə����񕜂��܂��B

�EVS-BATTLE
�@�@�l�Ԃ܂��̓R���s���[�^�Ƒΐ킷�郂�[�h�ł��B
�@�@��x�ɕ����̃��C���������Ƃ��ז��u���b�N�𑊎�ɑ��邱�Ƃ��ł��܂��B
�@�@���ז��u���b�N�ő�����Q�[���I�[�o�[�ɂ�����Ə����ł��B

�ETOOL-VS MAP EDIT
�@�@���̃��[�h�͌����Ɍ����Ɓu�Q�[���v���[�h�ł͂���܂���B
�@�@VS-BATTLE�ƃl�b�g�v���C�Ŏg�p�ł���}�b�v���쐬�ł��郂�[�h�ł��B
�@�@[�t�B�[���h�ҏW��ʂ̂Ƃ��̑�����@]
�@�@�@Up/Down/Left/Right: �J�[�\���𓮂���
�@�@�@A: �J�[�\���ʒu�Ƀu���b�N��u��
�@�@�@B: ���j���[�ɖ߂�
�@�@�@C+Left/Right: �z�u����u���b�N�̐F��I��
�@�@�@D: �J�[�\���ʒu�ɂ���u���b�N������

�EAVALANCHE 1P (RC1)
�@�@�����F�̃u���b�N���c������4�ȏ�q���ď����Ă������[�h�ł��B�r���Ő܂�Ȃ����Ă��Ă�OK�ł����A�΂߂ɂ͂������܂���B
�@�@�󒆂ɕ������u���b�N�͑S�ďd�͂ɏ]���ė������܂��B����𗘗p���ĘA�����\�ł��B
�@�@�I�ׂ�Q�[���^�C�v��SQUARE���[�h�Ɠ����ł��B
�@�@�܂Ƃ��Ƀv���C����ꍇ�́uAVALANCHE�v���[�����g�p���Ă��������B

�EAVALANCHE 1P FEVER MARATHON (RC1)
�@�@�A���̃^�l�i���炩���ߊȒP�ɘA���ł���悤�ɑg�܂ꂽ�u���b�N�j���ς܂ꂽ��ԂŃQ�[�����n�܂�܂��B
�@�@��Ԓ����A�����ł���Ǝv���Ƃ���Ƀu���b�N��u���āA�A�����X�^�[�g�����Ă��������B
�@�@�A���I����A�V�����A���̃^�l���o�����܂��B���܂��A���ł���΁A���ɏo������A���̃^�l���傫���Ȃ�A�������Ԃ������܂��B
�@�@�܂Ƃ��Ƀv���C����ꍇ�́uAVALANCHE�v���[�����g�p���Ă��������B

�EAVALANCHE VS-BATTLE (RC1)
�@�@AVALANCHE 1P���[�h�Ǝ������[���őΐ킵�܂��B�A���Ńu���b�N�������Ƒ���Ɏז��u���b�N�𑗂荞�ނ��Ƃ��ł��܂��B
�@�@�܂Ƃ��Ƀv���C����ꍇ�́uAVALANCHE�v���[�����g�p���Ă��������B

�EAVALANCHE VS FEVER MARATHON (RC1)
�@�@�A���̃^�l�i���炩���ߊȒP�ɘA���ł���悤�ɑg�܂ꂽ�u���b�N�j���ς܂ꂽ��ԂŃQ�[�����n�܂�܂��B
�@�@�A������ƁAHANDICAP���̐����������Ă����܂��B���ꂪ0�ɂȂ�ƁA����Ɏ��ۂɍU���ł���悤�ɂȂ�܂��B
�@�@�܂Ƃ��Ƀv���C����ꍇ�́uAVALANCHE�v���[�����g�p���Ă��������B

�EAVALANCHE VS DIG RACE (RC1)
�@�@�������ɁA7�F�Ɍ����΃u���b�N���������Ƃ��ړI�̃��[�h�ł��B��΃u���b�N�͑��̃u���b�N�̉��ɖ�����Ă��܂��B
�@�@�傫�ȘA��������Ƒ���Ɏז��u���b�N�𑗂邱�Ƃ��o���܂����A�v������^����قǂ̍U���͂͂���܂���B
�@�@�܂Ƃ��Ƀv���C����ꍇ�́uAVALANCHE�v���[�����g�p���Ă��������B

�EPHYSICIAN (RC1)
�@�@���炩���߃t�B�[���h���ɒu����Ă���E�C���X�i��΃u���b�N�j���A�ォ�痎���Ă���3�F�̃J�v�Z���i�ʏ�u���b�N�j���g���ď����Ă������[�h�ł��B
�@�@�J�v�Z���͏c������4�ȏ���ׂ�Ə����܂��B�q�����Ă��铯�F�̃E�C���X���ꏏ�ɏ����܂��B
�@�@�S�ẴE�C���X�������ƃX�e�[�W�N���A�ł��B
�@�@�܂Ƃ��Ƀv���C����ꍇ�́uPHYSICIAN�v���[�����g�p���Ă��������B

�EPHYSICIAN VS-BATTLE (RC1)
�@�@PHYSICIAN���[�h�̃��[���őΐ킵�܂��B
�@�@���肪�Q�[���I�[�o�[�ɂȂ邩�A��ɃE�C���X��S�ď����Ə����ł��B
�@�@�܂Ƃ��Ƀv���C����ꍇ�́uPHYSICIAN�v���[�����g�p���Ă��������B

�ESPF VS-BATTLE (BETA)
�@�@�ォ�痎���Ă���m�[�}���W�F���i�ʏ�u���b�N�j��ςݏグ�A���X�����Ă���N���b�V���W�F���i��΃u���b�N�j���g���ăm�[�}���W�F���������Ă����܂��B
�@�@2�~2�ȏ�̑傫���œ��F�̃m�[�}���W�F�����l�p�`�^�ɑg�ݍ��킹��ƁA��苭�͂ȃp���[�W�F���ɕω����܂��B
�@�@�m�[�}���W�F����p���[�W�F���͂�����ł��q���Ă������Ƃ��ł��܂����A�N���b�V���W�F�����g��Ȃ�����������Ƃ��ł��܂���B
�@�@�N���b�V���W�F�����g���ăW�F���������ƁA����ɃJ�E���^�[�W�F���i�ז��u���b�N�j�𑗂荞�ނ��Ƃ��ł��܂��B
�@�@�܂Ƃ��Ƀv���C����ꍇ�́uSPF�v���[�����g�p���Ă��������B

�yBGM��炷�ɂ́z
�܂�BGM�͕W���ł͕t���Ă��܂��񂪁A�C�ӂ̉��y�t�@�C�����Đ��ł��܂��B
BGM�̐ݒ������ɂ̓~���[�W�b�N���X�g�G�f�B�^(musiclisteditor.bat)���g���Ă��������B
�Ή��`���͂��Ԃ�u.ogg�v�u.wav�v�u.xm�v�u.mod�v�u.aif�v�u.aiff�v��6��ނł��B

�����ogg�t�@�C��������ƃ��[�v���鎞�ɗ�����悤�ł��B

�y�l�b�g�v���C(����)�z
[�ł��邱��]
�E���̃v���C���[�Ƒΐ�(�ő�6�l)
�E�V�������[�������
�E���łɂ��郋�[���ɓ���
�E�ȒP�ȃ`���b�g�@�\
�E�ϐ�
[�ł��Ȃ�����]
�E���̑��قƂ�ǑS��

[�l�b�g�v���C�̂͂��ߕ�]
�l�b�g�v���C���[�h�ɓ�����@:
�@1. ���ʂɃQ�[�����N�����܂��B3����ǂ̃o�[�W�����ł�OK�ł��B
�@2. Swing�o�[�W�����ł́A�t�@�C�����j���[����u�l�b�g�v���C�v��I�����܂��B
�@   ���̑��̃o�[�W�����ł́A�g�b�v���j���[����uNETPLAY�v��I������A�{�^���������܂��B
�@3. �uNullpoMino NetLobby�v�Ƃ����E�B���h�E������܂��B

�V�����T�[�o�[�����X�g�ɒǉ�������@:
�@1. �T�[�o�[�I�����(NullpoMino NetLobby�Ƃ����E�B���h�E���o����������̏��)�Łu�ǉ��v�{�^�����N���b�N���܂��B
�@2. �z�X�g��(�܂���IP�A�h���X)�ƃ|�[�g�ԍ��������ʂ��o�Ă��܂��B
�@   �u�z�X�g���܂���IP�A�h���X:�|�[�g�ԍ��v�̌`���œ��͂��Ă��������B(�z�X�g���ƃ|�[�g�ԍ����R���}�u:�v�ŋ�؂�܂�)
�@   �T�[�o�[���̃|�[�g�ԍ���9200�̏ꍇ�́u:9200�v���z�X�g���̌��ɂ���K�v�͂���܂���B
�@3. ���͂�����OK�{�^�����N���b�N���Ă��������B

�@���[�J���Ńl�b�g�v���C�������ɂ́Anetserver.bat���_�u���N���b�N���ăT�[�o�[���N����
�@�u127.0.0.1�v���T�[�o�[���X�g�ɒǉ����Ă��������B

�@harddrop.com�̊F���񂪃l�b�g�v���C�T�[�o�[��񋟂��Ă��܂��Bharddrop.com�̊F���񂠂肪�Ƃ��I
harddrop.com

�ǉ������T�[�o�[�ɐڑ�������@:
�@1. ���O�ƃg���b�v���j�b�N�l�[�����ɓ��͂��܂��i�C�Ӂj
�@   ���O���g���b�v�����͂��Ȃ��ꍇ�͎����I�ɖ��O���unoname�v�ɂȂ�܂��B
�@   �g���b�v��2ch�Ƃ��ɂ���悤�Ȍl���ʋ@�\�ł��B�j�b�N�l�[������#�L���̌�Ƀp�X���[�h������ƈÍ������ꂽ�����񂪕\������܂��B
�@    Wikipedia�ł̃g���b�v�̋L���F
�@    http://ja.wikipedia.org/wiki/%E3%83%88%E3%83%AA%E3%83%83%E3%83%97_(%E9%9B%BB%E5%AD%90%E6%8E%B2%E7%A4%BA%E6%9D%BF)
�@2. �ڑ��������T�[�o�[�����X�g�{�b�N�X����I�т܂��B(�_�u���N���b�N����Ƒ��ڑ��ł��܂�)
�@3. �u�ڑ��v�{�^�����N���b�N���܂��B��ʂ����r�[��ʂɐ؂�ւ��܂��B

�V�����i�ΐ�p�́j���[�����쐬������@:
�@1. ��ʏ㕔�ɂ���u���[���쐬�v�{�^�����N���b�N���܂��B
�@2. ���[���̖��O(�ȗ���)�ƎQ���\�ȍő�l������͂��܂��B
�@3. OK�{�^�����N���b�N���܂��B

1�l�v���C�p���[�����쐬������@:
�@1. ��ʏ㕔�ɂ���u1�l�v���C�v�{�^�����N���b�N���܂��B
�@2. �v���C���郂�[�h�ƃ��[����I�����܂��B
�@3. OK�{�^�����N���b�N���܂��B

���łɂ��郋�[���ɓ�����@:
�@���[���ꗗ�\�œ��肽�����[�������_�u���N���b�N���邾���ł��B
�@�ϐ킾���������ꍇ�́A�ϐ킵�������[�������E�N���b�N���āA�o�Ă����E�N���b�N���j���[����u�ϐ�v��I�т܂��B

OK�V�O�i�����o��:
�@1. �Q�[���E�B���h�E(���i1P�Q�[����V�ԃE�B���h�E)���N���b�N���āA�Q�[���E�B���h�E�ɑ�����ڂ��܂��B
�@2. A�{�^���������܂��B�uOK�v�Ǝ����̃t�B�[���h�ɏo�Ă����犮���ł��B
�@3. ���̕����ɂ���S����OK�V�O�i�����o���ƃQ�[�����n�܂�܂��B

[�T�[�o�[�ɂ���]
netserver.bat���_�u���N���b�N����ƃT�[�o�[���N�����܂����A���̏ꍇ�̃|�[�g�ԍ��̓f�t�H���g��9200�ŌŒ�ł��B
���̃|�[�g�ɕς������ꍇ�A�����Linux�܂���Mac OS X���g���Ă���ꍇ�͈ȉ��̃R�}���h���g���Ă��������B

Windows:
java -cp NullpoMino.jar;lib\log4j-1.2.15.jar mu.nu.nullpo.game.net.NetServer [�|�[�g�ԍ�]
Linux/MacOS:
java -cp NullpoMino.jar:lib/log4j-1.2.15.jar mu.nu.nullpo.game.net.NetServer [�|�[�g�ԍ�]

2�Ԗڂ̈�����ݒ肷�邱�ƂŁA�ʂ�netserver.cfg����ݒ��ǂݍ��ނ��Ƃ��ł��܂��B
Windows:
java -cp NullpoMino.jar;lib\log4j-1.2.15.jar mu.nu.nullpo.game.net.NetServer [�|�[�g�ԍ�] [netserver.cfg�̏ꏊ]
Linux/MacOS:
java -cp NullpoMino.jar:lib/log4j-1.2.15.jar mu.nu.nullpo.game.net.NetServer [�|�[�g�ԍ�] [netserver.cfg�̏ꏊ]

�yFAQ�z
Q: Slick�łŃW���C�X�e�B�b�N�������Ȃ�
A: GENERAL CONFIG��ʂ�"JOYSTICK METHOD"�̐ݒ��LWGJL�ɕς��āAJOYSTICK SETTING��ʂ̐ݒ�����낢��M���Ă��������B
   Slick�ł̃W���C�X�e�B�b�N�T�|�[�g��SDL�łقǗǂ��Ȃ��ł��B

Q: SDL�ł̃l�b�g�v���C�Ŏg�pRAM����������
A: Swing�ł�Slick�ł��g���Ă��������B���̂Ƃ���܂Ƃ��ȉ������@�͂���܂���BSDL��SDLJava���̖����ۂ��ł��B

Q: 64bit��OS���g���Ă��܂��BSDL�ł������܂���B
A: �����B

Q: �l�b�g�v���C�Ń��[�g��1�l�v���C�̋L�^���ۑ�����Ȃ�
A: ���O�Ƀg���b�v�������Ă��Ȃ��ƋL�^�͕ۑ�����܂���B
   �g���b�v������ɂ́A���O�̌��ɃV���[�v�L���i#�j�ƃp�X���[�h�����Ă��������B
   �i�Ⴆ�΁A���O����"ABCDEF#nullpomino"�Ɠ���Đڑ������"ABCDEF ��gN6kJVofq6"�ɂȂ�܂�)

�y����E�ӎ��z
����F
	NullNoname ��bzEQ7554bc (�ʖ�pbomqlu910963�A��������) pbomqlu910963@gmail.com
	Zircean
	Poochy.EXE�i�|�`�G�O�[�j
	Wojtek (aka dodd)
	Spirale (olivier.vidal1 on the SVN)
	kitaru2004
	Shrapnel.City (aka Pineapple)
	vic7070 (aka Digital)
	alight
	nightmareci
	johnwchadwick (aka nmn)
	prelude234 (aka awake)
	sesalamander
	teh_4matsy@lavabit.com (aka 4matsy)
	delvalle.jacobo (aka clincher)
	bob.inside (aka xlro)

	Google Code��People�y�[�W:
	http://code.google.com/p/nullpomino/people/list

���̃Q�[���͈ȉ��̃c�[���E���C�u�����E�f�ނ��g�p���܂����B
���̏���؂�Ă���\���グ�܂��B

�E�c�[��
	Eclipse 3.6
	http://www.eclipse.org/
	PictBear SE
	http://www20.pos.to/~sleipnir/

�E���C�u����
	Slick - 2D Game Library based on LWJGL
	http://slick.cokeandcode.com/
	Lightweight Java Game Library (LWJGL)
	http://www.lwjgl.org/
	JOrbis -- Pure Java Ogg Vorbis Decoder
	http://www.jcraft.com/jorbis/
	IBXM Java MOD/S3M/XM Player
	http://sites.google.com/site/mumart/
	sdljava - Java Binding to SDL
	http://sdljava.sourceforge.net/
	Simple DirectMedia Layer
	http://www.libsdl.org/
	Apache log4j 1.2.15
	http://logging.apache.org/log4j/1.2/index.html
	Crypt.java (Java-based implementation of the unix crypt(3) command)
	http://www.cacas.org/java/gnu/tools/

�E���ʉ�
	�U�E�}�b�`���C�J�@�Y
	http://osabisi.sakura.ne.jp/m2/
	TAM Music Factory
	http://www.tam-music.com/

�E�w�i (res/graphics/oldbg)
	���t���[�ʐ^�f�ޏW
	http://www.yunphoto.net/

�E�t�H���g
	�I���W�i���t�H���g�y�݂������z
	http://www001.upp.so-net.ne.jp/mikachan/

�EAlso thanks to:
	Lee
	Burbruee
	Steve
	Blink
	xlro (http://nullpo.nu.mu/)
	vicar (http://vicar.bob.buttobi.net/)
	SWR
	hebo-MAI
	gif
	virulent
	tetrisconcept.net http://www.tetrisconcept.net/
	Hard Drop http://harddrop.com/
	 (NullpoMino Topic: http://harddrop.com/forums/index.php?showtopic=2035
	  NullpoMino Guide: http://harddrop.com/forums/index.php?showtopic=2317
	  NullpoMino on HD wiki: http://harddrop.com/wiki/index.php?title=NullpoMino)
	Puyo Nexus http://www.puyonexus.net/

�yGoogle Code�̃v���W�F�N�g�y�[�W�z
http://code.google.com/p/nullpomino/

�y�X�V�����z
+�͐V�@�\�A-�̓o�O�C���A*�͂��̑��̏C���A#�͂��̑��������Ӗ����܂��B

Version 7.5.0 (2011/01/21) {r518-r716; Stable Release}
#���̃o�[�W��������7.4.0�̃T�[�o�[�Ƃ̌݊����͎����܂��B
+Swing/Slick: ��ʃT�C�Y�ݒ��ǉ����܂����B
+Slick/SDL: ���[�h�t�H���_�@�\��ǉ����ASTART��I�񂾒���͂������߃��[�h�ꗗ���o��悤�ɂ��܂����B
+Slick: LWGJL�̃o�[�W������2.6�ɏグ�܂����B
+DIG CHALLENGE���[�h��ǉ����܂����B
+Practice: Hebo Hidden�I�v�V������ǉ����܂����B
+AI: Avalanche���[�h�pAI"Avalanche-R"�ACombo Race���[�h�pAI"Combo Race"�A��΃t�@�C�����g��"Ranks AI"�ƁA��΃t�@�C���𐶐�����Ranks AI Tool��ǉ����܂����B
+�X�e�B�b�L�[�ȃu���b�N�X�L����ǉ����܂����i#9��#27�j
+NetServer: ���萫���A�b�v���܂����BCPU��L��100%�o�O���C�����܂����B
#�l�b�g�v���C�̋����F
 +���[�g����̃��[���̓v���Z�b�g�`���ɂȂ�܂����B�g�p���郋�[���͊e�l�����R�ɑI�ׂ܂��B
 +�I�����C����1�l�v���C��MARATHON, MARATHON+, EXTREME, DIG RACE, COMBO RACE, ULTRA, TECHNICIAN, TIME ATTACK���[�h��ǉ����܂����B
 +�I�����C����1�l�v���C�ɑS���[�����ʂ̃����L���O��ǉ����܂����B���[���I���Łu(���g�p���̃��[��)�v��I�ԂƎg���܂��B
 +���r�[�ƃ��[���ɓ�����������ɍŋ߂̃`���b�g�������\�������悤�ɂȂ�܂����B
 +�`�[����Ŗ��O���F���������悤�ɂȂ�܂����B
 +�G�v���C���[���ɉ����Č��̈ʒu���ς��ݒ��ǉ����܂����B
 *���̑����낢��
-PoochyBot�̂��낢��ȃo�O�C�������܂����B�܂��A��s�v�l�I�v�V������AI�ݒ��ʂɒǉ����A"No Prethink"�ł͔p�~���܂����B
-���̑��̂��낢��ȃo�O���C�����܂����B
*�A�C�R�����V�����Ȃ�܂����B�f�t�H���g�̂��̂�gif����A����ȊO�̂�virulent����쐬�ł��B���肪�Ƃ��I
*Readme��LICENCE.txt�ȊO�̃e�L�X�g�t�@�C����"doc"�t�H���_�Ɉڂ��܂����B
#���ׂ̍����ύX���e��doc/svnlog7_5_0.txt�ɂ���܂�(�p��ł����c)

Version 7.4.0 (2010/10/29) {r277-r517; Unstable Release}
#���̃o�[�W��������7.3.0�̃T�[�o�[�Ƃ̌݊����͎����܂��B
+Swing/Slick/SDL: ���傫����NEXT�\����ǉ����܂����B (GENERAL OPTIONS��"SHOW NEXT ON SIDE"��"BIG SIDE NEXT"�̗�����L���ɂ��Ă�������)
+Swing/Slick/SDL: ���j���[��ʂŃQ�[�����Ƃ͕ʂ̃L�[�z�u���g���悤�ɂ��܂����B(�^�ۗ��_�Ȃ̂ł��ӌ���W��)
+Swing/Slick/SDL: �f�t�H���g�̉�]���������ɕς��܂����BAUTO�ɖ߂��ɂ�"GAME TUNING"���j���[��"A BUTTON ROTATE"�̐ݒ��ύX���Ă��������B
+Swing/Slick/SDL: �������߃��[���I����ʂ�ǉ����܂���(���[�h�I����ɏo��)�B
+Slick/SDL: �L�[�ݒ��ʂŃL�[���ʂɕύX�ł���悤�ɂ��܂����B
+Slick/SDL: ����N�����̐ݒ��ʂ������܂����B�L�[�z�u�̏����ݒ��Blockbox�X�^�C���ɂȂ��Ă��܂��B
+Slick/SDL: �������̃��j���[�Ń}�E�X���g����悤�ɂȂ�܂���(�s���S)
+Slick: "NullpoMino.exe"��ǉ����܂����B�_�u���N���b�N�����Slick�ł��N�����܂��B
+Avalanche/SPF: �Q�[����ʂ̕\����傫�����̂ɕύX�ł���ݒ��ǉ����܂����B
+�V�����X�L����ǉ����܂���(4matsy���񂠂肪�Ƃ��I)
#�l�b�g�v���C�ɐV�@�\�𑽐��ǉ����܂����F
 +���[�g�ϓ��̂��郋�[���ƃ��[�g�����L���O
 +���[�����ł����r�[�������
 +NetServer�Ǘ��c�[��"NetAdmin"
 +1�l�v���C���[�� (���̂Ƃ���LINE RACE��SCORE RACE���[�h�̂�)
#���ׂ̍����ύX���e��svnlog7_4_0.txt�ɂ���܂�(�p��ł����c)

Version 7.3.0 (2010/08/09) {r1-r276; Stable Release}
#���̃o�[�W��������7.2.0�̃T�[�o�[�Ƃ̌݊����͎����܂��B
#���̃o�[�W�����ȑO�̃��v���C�͂��̃o�[�W�������猩��܂���B
+Swing/Slick/SDL: ���v���C��ۑ�����Ƃ��Areplay�t�H���_�������ꍇ�͎����I�ɍ쐬����悤�ɂ��܂����B
+Swing/Slick/SDL: �o���ʒu�␳�����郋�[���ŁANEXT�s�[�X���������ʒu�ɕ\�������悤�ɂ��܂����B
+Swing/Slick/SDL: �t�B�[���h�̉���NEXT��\������ݒ��ǉ����܂����B
+Slick: PERFECT FPS�I�v�V������ǉ����܂����B(�t���[�����[�g����萳�m�ɂȂ�܂����A��葽����CPU�p���[���g�p���܂��B���j���[��ʂł͓����܂���B)
+Slick: LWJGL��2.5�ɁASlick��build 274�Ƀo�[�W�����A�b�v���܂����B
+�ȉ��̃��[�h��ǉ����܂���:COMBO RACE, SQUARE, RETRO MASTERY, AVALANCHE 1P, AVALANCHE 1P FEVER MARATHON, AVALANCHE VS-BATTLE, AVALANCHE VS FEVER MARATHON, AVALANCHE VS DIG RACE, PHYSICIAN, PHYSICIAN VS-BATTLE, SPF VS-BATTLE
 ���C�������^�łȂ����[�h�́A�����[�X����(AVALANCHE, PHYSICIAN)�܂��̓x�[�^��(SPF)�ł��B
 �X�y�V�����T���N�X:Puyo Nexus����(�A���̃^�l�̃f�[�^�����؂肵�܂����B���肪�Ƃ��I)
+STANDARD-HOLDNEXT, SQUARE, AVALANCHE, PHYSICIAN, SPF���[����ǉ����܂����B
+CLASSIC MARATHON���[�h��RETRO MARATHON�ɉ������܂����B
+Randomizer: NEXT�������A���S���Y���̃V�X�e����啝�ɕύX���A�����̐V�������̂�ǉ����܂����B���̂��߁A���̃o�[�W�����ȑO�̃��v���C�͂�������܂���B
+Sequencer: �o���\�s�[�X�̐ݒ��ʂ�ǉ����܂����B
+AI: "Defensive"��"No Prethink"�o�[�W������PoochyBot��ǉ����܂����B
+Engine: �����F�̃u���b�N����ׂď����^�C�v�̃��[�h(AVALANCHE, PHYSICIAN, SPF)�p�̋@�\�𑽐��ǉ����܂����B
+Engine: 7�F�Ɍ��郌�C���{�[�u���b�N��ǉ����܂����B
+Engine: DTET��STANDARD-SUPER3���[���p�ɑ҂����ԃL�����Z���̋@�\��ǉ����܂����B
+Engine: �����ߊ֘A�̋@�\���g�[���܂����B�ǉ����ꂽ�@�\�̑�����NINTENDO�n���[���Ŏg���Ă��܂��B
+Engine: ���[�v�ړ�(Instant DAS)�ƃh���b�v�L�[�𗣂��܂ŉ����߈ړ������Ȃ��@�\(Shift Lock)��ǉ����܂����B
+Engine: �n�[�h�u���b�N�ƌł��ז��u���b�N��ǉ����܂����B
+NetPlay/NetServer: ���[���쐬��ʂɂ�葽���̐ݒ荀�ڂ�ǉ����܂����B�܂��A�����̐ݒ荀�ڂ�V�����ł����^�u�Ɉڂ��܂����B
 �ז��u���b�N: B2B�Ō��̈ʒu��ς���A1��̍U�����ƂɎז��u���b�N�̌��̈ʒu��ς���A���̈ʒu���ς��m���A����オ��}���A���E
 �{�[�i�X: �X�s������^�C�v�A�S�����{�[�i�X
-NetPlay: SDL�łŃl�b�g�v���C���ɂ͐�����60FPS�Œ�ɂȂ�悤�ɂ��܂����B
-NetPlay: �Q�[����ʂ𒼐ڕ�����Java�̃v���Z�X�������I�����Ă��`���b�g���O���������ۑ������悤�ɂ��܂����B
-NetPlay: ���[���Œ肪�Ȃ����2���̃��[���ł��A�����NEXT��HOLD��������悤�ɂ��܂����B
-NetServer: �H�암���o�O���C�����܂����B
-Slick/SDL: �N����Ƀ��v���C���폜����ƃ��v���C�I����ʂŗ�����\��������o�O���C�����܂����B
+��葽���̃}�b�v��ǉ� (Jenn����ASecretSalamender����AMagnanimous���񂠂肪�Ƃ��I)
*Mac��Linux�p�̋N���p�V�F���X�N���v�g��ǉ����܂����B(croikle���񂠂肪�Ƃ��I)
*���̃��[�����Ƃ̐������̂��߁AStandard-GIZA���[���̖��O�Ƀn�C�t����ǉ����܂����B
*JRE1.5�Ƃ̌݊������������܂����B
*[�����ύX] ���C���̃p�b�P�[�W����mu.nu.nullpo�ɕύX���܂����B
*[�����ύX] �������̃\�[�X���̃R�����g���p��ɂȂ�܂����B

Version 7.2.0 (2010/06/19)
#���̃o�[�W��������7.1.*�̃T�[�o�[�Ƃ̌݊����͎����܂��B
+Slick/SDL: �V�����^�C�g����ʂ�ǉ����܂����B(Zircean���񂠂肪�Ƃ��I)
+Swing/Slick/SDL: �S�[�X�g��g���ŕ\������ݒ�("OUTLINE GHOST PIECE")��ǉ����܂����B
+NET-VS MAP EDIT: �V�����@�\�uGRAY->?�v��ǉ����܂����B�g�p����ƁA�t�B�[���h�̂��ׂĂ̊D�F�u���b�N�Ƀ����_���ɐF��t���܂��B
+NetPlay/NetServer: ���[���f�[�^�A�}�b�v�f�[�^�A(�K�v�ȂƂ��̂�)�t�B�[���h�f�[�^�����k���đ��M����悤�ɂ��܂����B(�]���ʍ팸�ł��邩���H)
-Slick: �^�C�g����ʂɖ߂��Ă��^�C�g���o�[�Ƀ��[�h�����c�����܂܂ɂȂ�o�O���C�����܂����B
-NetPlay: �p��UI�̂Ƃ��{���g���b�v�ƋU�g���b�v�̋�ʂ��t���Ȃ��o�O���C�����܂����B���{��UI�ł͌��X���̃o�O�͂���܂���B(Wojtek���񂠂肪�Ƃ�!)
-NetPlay: �ؒf���Ă����[���ꗗ���c�����܂܂ɂȂ�o�O���C�����܂����B(hebo-MAI���񂠂肪�Ƃ��I)
-NetServer: onAccept()��CPU100%�ɂȂ�\��������ӏ����C�����܂����B
-GRADE MANIA 2: 20G��ON�̏ꍇ�̓����L���O���\������Ȃ��悤�ɂ��܂����B (2ch�X����>>779���񂠂肪�Ƃ��I)
*hebo-MAI����́uStandardGIZA�v���[�����ŐV�łɍX�V���܂����B�\�t�g�h���b�v���x���O�����オ���Ă��܂��B
*AI���v���C�����ꍇ�̓����L���O�Ɏc��Ȃ��悤�ɂ��܂����B���v���C�͂����Ǝc��܂��B(SWR���񂠂肪�Ƃ��I)
*[�����ύX] ���ׂĂ�AI�v���C���[��DummyAI���p������悤�ɂ��܂����B
 �]����AIPlayer�C���^�[�t�F�[�X���������Ă��܂������A���̕ύX�ȍ~��AIPlayer�ɐV�������\�b�h���ǉ�����Ă������̃R�[�h�̕ύX���K�v�����Ȃ�܂��B
*[�����ύX] PoochyBot/Crypt: �ʂ̃p�b�P�[�W�Ɉړ����܂����B(�O�҂�net.tetrisconcept.poochy.nullpomino.ai�A��҂�org.cacas.java.gnu.tools)

Version 7.1.0 (2010/06/15)
#���̃o�[�W��������7.0.*�̃T�[�o�[�Ƃ̌݊����͎����܂��B
#��҂͂��̃o�[�W��������uNullNoname ��bzEQ7554bc�v�̖��O�ƃg���b�v���g���܂��B
+Poochy���񐧍��AI�uPoochyBot v1.21�v��ǉ����܂����BPoochy���񂠂肪�Ƃ��I
+Swing/NetPlay: �l�b�g�v���C�T�[�o�[�́u�Ď��v�@�\��Swing�łɑΉ����܂����B
+NetPlay: �Q�[�����ʕ\�ɐV���ɁuKO�v�u�������v�u�������v�̍��ڂ�ǉ����܂����B
+NetPlay: �`���b�g���O�������I��log�t�H���_���ɕۑ�����悤�ɂ��܂����B
+NetServer: �g���b�v�@�\��ǉ����܂���(2ch�ɂ���悤�Ȃ���ł�)�B
 ���O����#�L���̌�Ƀp�X���[�h������ƈÍ������ꂽ�����񂪕\������܂��B
 Wikipedia�ł̃g���b�v�̋L���F
 http://ja.wikipedia.org/wiki/%E3%83%88%E3%83%AA%E3%83%83%E3%83%97_(%E9%9B%BB%E5%AD%90%E6%8E%B2%E7%A4%BA%E6%9D%BF)
+NetServer: �S����IP�܂��̓z�X�g�������J����@�\��ǉ����܂����B�\���^�C�v�́A�Í�������Ă��Ȃ������ƁA�Í������ꂽ�������2��ނ���I�ׂ܂��B
 "config/etc/netserver.cfg"��C�ӂ̃e�L�X�g�G�f�B�^�ŕҏW���Đݒ��ύX���܂��B
+hebo-MAI����쐬�̃��[���uStandardGIZA�v��ǉ����܂����B(hebo-MAI���񂠂肪�Ƃ��I)
-PHANTOM MANIA: Lv400�܂���900�ɂȂ����Ƃ��ɒi�ʕ\�����ēx�_�ł���o�O���C�����܂����B (Zircean���񂠂肪�Ƃ��I)
-GRADE MANIA 3: �b��GM��MM�ł͂Ȃ�GM�Ƃ��ĕ\�������o�O���C�����܂����B (Zircean���񂠂肪�Ƃ��I)
 ���ʉ�ʂŎb��GM�͌���MM�Ƃ��ĕ\�������悤�ɂ��܂����B
-NetPlay: 3�l�ȏ�̑ΐ�ŒN�����E�����Ă�BGM���~�܂�Ȃ��悤�ɂ��܂����B (SWR���񂠂肪�Ƃ��I)
*NetServer: ���b�Z�[�W���M�����s�����瑦�N���C�A���g��ؒf����悤�ɂ��܂����B(CPU100%�o�O�΍�)
*NetServer: �S�����ؒf�����烋�[���ꗗ��e�탁�������e�̑|��������悤�ɂ��܂����B(�H�암���o�O�΍�)
*NetPlay: Wojtek����̐V�����f�ГI�ז��u���b�N�V�X�e�����̗p���܂����B
*���ׂẴ��O�t�@�C����log�t�H���_�ɕۑ������悤�ɂ��܂����B

Version 7.0.2 (2010/06/06)
#�l�b�g�v���C�@�\��7.0.0�̃T�[�o�[�ƌ݊���������܂��B�T�[�o�[�ɕύX�͂���܂���B
+NetPlay: ���[���쐬��ʂ̈ꕔ�̐ݒ荀�ڂɃc�[���`�b�v��ǉ����܂����B
-NetPlay: �����̃u���b�N�̊G�������̂��̂ɂ���ւ��o�O���C�����܂����B
-NetPlay: ���l������������Łu�ݒ�m�F�v�{�^���������ƃ��[���쐬��ʂ̃f�t�H���g�l�����l�̃��[���̂��̂ɂȂ��Ă��܂��o�O���C�����܂����B
-�O�̃o�[�W�����ł��낢��ȃl�C�e�B�u���C�u�����������ĂȂ������̂��C�����܂����B

Version 7.0.1 (2010/06/06)
#�l�b�g�v���C�@�\��7.0.0�̃T�[�o�[�ƌ݊���������܂��B�T�[�o�[�ɕύX�͂���܂���B
+�X�V�`�F�b�N�@�\��ǉ����܂����B�V�����o�[�W���������J�����ƃ^�C�g�����(Swing�łł̓��[�h�Z���N�g���)�Œʒm����܂��B
 ���̂Ƃ���X�V�`�F�b�N�̐ݒ��ʂ�Swing�ł����ł��B
 �f�t�H���g�ł͍ŐV�ł̃`�F�b�N��Burbruee�����XML���g�p���Ă��܂��B�g�p����XML��Swing�ł̐ݒ��ʂ���ύX�ł��܂���
+�S�[�X�g�s�[�X�̐^���NEXT��\������ݒ��3���ׂẴo�[�W�����ɒǉ����܂����B(Wojtek���񂠂肪�Ƃ��I)
+Slick: �L�[�{�[�h�ݒ��ʂŃL�[�R�[�h�ł͂Ȃ��L�[�̖��O���o��悤�ɏC��
+NetPlay: ���[����ʂɁu�ݒ�m�F�v�{�^����ǉ����܂����B���[������o�邱�ƂȂ��e��ݒ���m�F�ł��܂��B
-NetPlay: �o�O������邽�߁A�Q��/�ϐ�{�^���͉��������ƃT�[�o�[����ԓ�������܂Ŗ�����(Wojtek���񂠂肪�Ƃ��I)
-NetPlay: �ϐ�{�^���ƃ`�[���ύX�{�^���͎Q�풆���Q�[�����͖�����(�Q�[�����ɂ����̃{�^���͂��Ƃ��ƌ��ʂ��Ȃ���������)
*NetPlay: �f�ГI�ז��u���b�N�V�X�e���g�p���̎ז��u���b�N���[�^�[�̕\�������P
*STANDARD-ZERO���[�����ŐV�łɍX�V(��]�{�^���͑���STANDARD�n�Ɠ����ɂȂ�܂���)
*�X�V�`�F�b�N�@�\�̈ꕔ��JRE1.6�ȏオ�K�v�ɂȂ����̂ŁAJRE1.5�ȉ��ł͓��삵�Ȃ��Ȃ�܂����B
*LWJGL 2.4.2��lib/LWJGL2_4_2�t�H���_�ȉ��ɓ���
 (64bit��Windows�̐l�ł��̂܂܂��Ɠ����Ȃ��ꍇ�͂��̒��̑S�t�@�C����lib�t�H���_�ɃR�s�[���Ă݂Ă�������)

Version 7.0.0 (2010/06/04)
#���̃o�[�W��������6.9.0.*�̃T�[�o�[�Ƃ̌݊����͎����܂��B
+�s�ȊO�̃X�s�������ǉ�(T-Spin�{�[�i�X�����郂�[�h�ŁA�uSPIN BONUS�v�̐ݒ���uALL�v�ɕς���ƗL�����ł��܂�)
+VS-BATTLE/NetPlay: �}�b�v�̐ݒ��ǉ����܂����B�}�b�v��L���ɂ��Ă���ꍇ�A���̃p�^�[���Ńu���b�N���ςݏオ������ԂŃQ�[�����n�܂�܂��B
 �}�b�v�͐V�����ǉ����ꂽ�uTOOL-VS MAP EDIT�v���[�h�ō쐬�ł��܂��B
+NetPlay: �u�f�ГI�ז��u���b�N�V�X�e�����g���v�̐ݒ��ǉ����܂����B
 3�l�ȏ�̃Q�[���ŁA�U���͂��Q���l���ɉ����Ċ���Z����܂��B����ɂ�菬���_�ȉ��̍U��(0.5�Ȃ�)����������悤�ɂȂ�܂��B
 �����_�ȉ��̍U���́A�ז��u���b�N���[�^�[��1.0�ȏ�ɂȂ�܂ł���オ��܂��񂪁A������̍U���ő��E����0�ɂ��Ȃ����葊��ɍU���ł��܂���B
+NetPlay: �u�N�����L�����Z��������^�C�}�[�������v�̐ݒ��ǉ�(6.9.0.1�ō폜�����@�\�����R�ɐ؂�ւ��ł���悤�ɂ��ĕ���)
+NetPlay: ���[���쐬��ʂ̐ݒ���^�u�ɕ����܂����B���x�֘A�̐ݒ�́u���x�̐ݒ�v�^�u�Ɉڂ��܂����B

Version 6.9.0.2 (2010/05/08)
#�l�b�g�v���C�@�\��6.9.0.*�̃T�[�o�[�Ƃ܂��݊���������܂����A���̃o�[�W�����̃T�[�o�[�ɂ������̃o�O�C��������܂��B
+NetPlay: �`�[���ύX�{�^�������r�[��ʂƃ��[����ʂɒǉ�
+Swing: ���[�h�����_�u���N���b�N���邾���ŃQ�[�����J�n�\
-Slick: 64bit��LWJGL�̃��C�u������2.1.0�p�ɖ߂��Ă��Ȃ������̂��C��
-NetPlay: �t�B�[���h�X�V������ArrayIndexOutOfBoundsException����������o�O���C��
-NetServer: �`�[����̂��낢��ȃo�O���C��
-NetServer: ���ԑ҂��������������Ă��Ȃ��o�O������������

Version 6.9.0.1 (2010/05/07)
#�T�[�o�[�ɏ������ύX�_������܂����A�l�b�g�v���C�@�\��6.9.0.0�̃T�[�o�[�Ƃ܂��݊���������܂��B
+STANDARD-PLUS(Blink�����)��STANDARD-ZERO���[��(Wojtek�����)��ǉ����܂����B
+�N���p�o�b�`�t�@�C����32bit��64bit�̗����œ����o�[�W�����ɕς��܂����B(dodd���񂠂肪�Ƃ��I)
+NetPlay: �܂��܂Ƃ���GUI�͂���܂��񂪁A�`�[�������r�[�܂��̓��[����ʂ���ς�����悤�ɂ��܂����B
 �`���b�g���͗��Ɂu/team <�`�[����>�v�Ɠ��͂���Enter�L�[�������Ə�������`�[����ύX�ł��܂��B
 �`�[�������ɂ���ɂ́u/team�v�Ƃ������͂��Ă��������B
*NetPlay: Ping(�ڑ��e�X�g���b�Z�[�W)���T�[�o�[�ɑłԊu��10�b�ɕύX���܂����B�܂��A30�b�ȏ�T�[�o�[���牞�����Ȃ��ꍇ�͐ؒf���܂��B
*NetServer: �uOK�\�����������ƃ^�C�}�[�������v�@�\���폜���܂����B(���o�[�W�����ŔC�ӂ�ON/OFF�ł���`�ŕ����\��)
*Slick: LWJGL�̃o�[�W������2.1.0�ɖ߂��܂����B(2.4.2�ŕs����o��l�����������̂�)

Version 6.9.0.0 (2010/05/06)
#���̃o�[�W��������6.8�̃T�[�o�[�Ƃ̌݊����͎����܂��B
+�uDIG RACE�v���[�h��ǉ����܂����B
+GARBAGE MANIA: BIG�L�����ł�����Ƀv���C�\�ɂȂ�܂����B
+SDL/Slick: ����N�����̃L�[�{�[�h�ݒ��ʂ̂��ƁA���[���I����ʂ��o��悤�ɂ��܂����B
+NetPlay: �����I�ȃ`�[���v���C�@�\��ǉ����܂����B�����`�[���ɏ�������v���C���[�͍U�����󂯂���A�^�����肷�邱�Ƃ͂���܂���B
 �N�����E�����A�c�����v���C���[�S���������`�[���ɏ������Ă����ꍇ�͂��̎��_�ŃQ�[�����I�����A���������`�[�������`���b�g���O�ɕ\������܂��B
+NetPlay: �uTNET2�^�̎����X�^�[�g�^�C�}�[���g���v�̐ݒ��ǉ����܂����BON�ɂ���Ǝ����X�^�[�g�@�\�Ɉȉ��̕ω�������܂��B
 1.2�l�ȏオOK�\�����o���܂Ń^�C�}�[���n�܂�Ȃ��Ȃ�
 2.�^�C�}�[��0�ɂȂ����Ƃ��AOK�\�����o���Ă��Ȃ��v���C���[�S���������I�Ɋϐ탂�[�h�ɂȂ�
 3.�N����OK�\�������������Ƃ��A���̃Q�[�����n�܂�܂Ń^�C�}�[���쓮���Ȃ��Ȃ�
-NetPlay: �ȉ��̃o�O���C�����܂����B
 1.�Q�[���i�s���̕����ɓ������Ƃ��ɁA�����̃t�B�[���h�̎ז��u���b�N���[�^�[�����܂��Ă���(�x��������)���Ƃ�����
 2.�ז��u���b�N���[�^�[��20���C���ȏ�̎ז��u���b�N�����܂��Ă���ƁA�����������[�^�[�t�߂ɕ\�������
 3.1�l�������S����OK�\�����o���Ă���Ƃ��A����1�l���ϐ탂�[�h�Ɉڍs���邩�ޏo����ƁA�Q�[�����n�܂�Ȃ�
 4.���ԑ҂����Ă���Ƃ��ɒN�����ޏo���Ă��̐l�Ɠ���ւ���Ă��A�t�B�[���h�\�����������܂܂ŁAOK�\�����o���Ȃ�
 �o�O��������dodd���񂠂肪�Ƃ��I
*Slick: LWGJL�̃o�[�W������2.4.2�ɍX�V���܂����B

Version 6.8.0.0 (2010/04/30)
#���̃o�[�W��������6.7�̃T�[�o�[�Ƃ̌݊����͎����܂��B
+GAME TUNING(�`���[�j���O�ݒ�)��ǉ����܂����B�ꕔ�̐ݒ���g�p���郋�[���Ɋ֌W�Ȃ��Œ�ł��܂��B
 A�{�^���̉�]�����A�u���b�N�̊G���A�����߂Ɖ��ړ����x��ύX�ł��܂��B
 SDL/Slick�łł�CONFIG��ʂ́uGAME TUNING�v�ɁASwing�łł́u�ݒ聨1P(2P) �`���[�j���O�ݒ�v�ɂ���܂��B
 �ݒ���e��SDL/Slick/Swing�S�Ăŋ��L����A�l�b�g�v���C�ł��g�p�ł��܂��B(���[���Œ蕔���ł��g�p�\)
+SDL/Slick: �W���C�X�e�B�b�N�̐ݒ��ʂ��������W���C�X�e�B�b�N�e�X�g��ʂ�ǉ����܂����B
 �قƂ�ǂ̃W���C�X�e�B�b�N�ݒ��GENERAL OPTIONS���炱���Ɉړ����܂����B
+NetPlay: ���[���쐬��ʂɁu3�l�ȏ�̑ΐ�ł͍U���͂����炷�v�̐ݒ��ǉ����܂����B
 3�l�ȏ�őΐ킵���Ƃ��A�S���̍U���͂�2�l�ΐ�̂Ƃ��Ɣ�ׂė}���C���ɂȂ�܂��B
 �E���҂�������ƍU���͂͑����čs���܂��B
+VS-BATTLE/NetPlay: HURRY UP�֘A�̐ݒ��ǉ����܂����B
 �w�肵���b�����o�߂���ƃA���[��������A����������Ȃ����u���b�N�����肠�����Ă��܂��B
 �f�t�H���g�ł�5��u���b�N�s�[�X��u���Ə��u���b�N���オ��܂����A������ݒ�ŕύX�ł��܂��B
 (VS-BATTLE�ł́uINTERVAL�v�A�l�b�g�v���C�ł́uHURRY UP��A�����グ��Ԋu�v�ŕύX�\)
+NetPlay: 1�񌈒��������ƂɃK�x�[�W�R���N�V���������s����悤�ɂ��܂����B
-NetPlay: ���[�������폜����Ƃ��ɂ��̃��[���̃v���C���[���X�g�����S�ɑ|������悤��
-NetServer: �s���S�p�P�b�g���c���Ă���v���C���[���ؒf�����ꍇ�ɂ��̕s���S�p�P�b�g���c�葱����o�O���C��
-SDL/Slick: "SCREEN SHOT"��"SCRREN SHOT"�ɂȂ��Ă����ӏ����C��
*GEM MANIA: Ready&Go�̎��Ԃ�Z�k

Version 6.7.0.0a (2010/04/12)
#���̃o�[�W�����͏������o�O�C���p�b�`�ł��B�g���ɂ͑O�o�[�W����(6.7.0.0)�ɏ㏑�����K�v�ł��B
#�C������̂̓l�b�g�v���C�p�T�[�o�[�����ŃQ�[�����e�ɕύX�͂���܂���B
-NetServer: "broken pipe"��IOException��doWrite(SocketChannel)�ő�ʂɏo��o�O�̑΍�
 1.doWrite(SocketChannel)�̃��O���x����error����debug�Ɉ�������
 2.���M�G���[�����������Ƃ��͂��̃N���C�A���g��ؒf����悤��(���Ԃ�������̃N���C�A���g�ɑ΂��Ă͉������M�ł��Ȃ��̂�)
-PHANTOM MANIA�̍ŐV�Ń\�[�X���O�o�[�W�����ɓ����ĂȂ������̂ňꏏ�ɓ���܂���

Version 6.7.0.0 (2010/04/10)
#���̃o�[�W��������6.6�̃T�[�o�[�Ƃ̌݊����͎����܂��B
+NetPlay: ���x�ET-Spin�EB2B�E�R���{�̐ݒ��ǉ�
+NetPlay: ���[����ʂő��̃v���C���[�̃v���C���ʕ\����ǉ�
+NetPlay: �����X�^�[�g�^�C�}�[�@�\��ǉ�(�����ȏ�̃v���C���[�̏�������������Ƃ��̃^�C�}�[�������܂��B0�b�ɂ���Ə]���ʂ�^�C�}�[�Ȃ�)
+NetPlay: AI���g�p�\��(������1�l�v���C����K��F�{�^�����g���Ȃ��Ƃ�����肠��)
*NetServer: ���O�t�@�C���̏o�͐ݒ�̃f�t�H���g�l��ύX(����ō��v50MB�𒴂��Ȃ��͂�)
-PHANTOM MANIA: LV999�܂ōs�������Ƃ̗΁E�򃉃C���̏󋵂������L���O�ɋL�^����Ȃ��o�O���C��
-PHANTOM MANIA: RO���_���̕\�L��SK���_���ɂȂ��Ă����o�O���C��

Version 6.6.0.1 (2010/04/06)
#�}�C�i�[�o�[�W�����A�b�v�ł��B�l�b�g�v���C�@�\��6.5�̃T�[�o�[�ƌ݊���������܂��B
+�ȉ��̃��[�h�Ƀx�X�g�Z�N�V�����^�C���̋L�^�@�\��ǉ�
 GRADE MANIA (�S��)
 SPEED MANIA (�S��)
 GARBAGE MANIA
 PHANTOM MANIA
 SCORE ATTACK
 FINAL
+GRADE MANIA 3: �����L���O�������@�\��ON/OFF�ŕ����Ă݂�
+AI: �uT-SPIN�vAI��ǉ�(�܂�WIP)
+NetPlay: 1�l�����Ŏn�߂��Ƃ��͗��K���[�h�Ɠ��l��F�{�^���ŃQ�[���������I���ł��܂�
-NetPlay: �������Ƃ��ɏ���������̃t�B�[���h�ɁuWIN!�v�܂��́u1ST PLACE!�v�̃��b�Z�[�W���o�Ȃ����Ƃ�����o�O���C��
-GRADE MANIA 2/SPEED MANIA: ARE���L���̃��[����RE���_������ɓ���Ȃ��o�O���C��
-TECHNICIAN: LV15-EASY��LV15-HARD�̃��x��15�����C������T-Spin�Œʉ߂���ƃ��C���������܂ŃQ�[�����I���Ȃ��o�O���C��

Version 6.6.0.0 (2010/04/03)
#���̃o�[�W��������6.5�̃T�[�o�[�Ƃ̌݊����͎����܂��B
+SDL/Slick/NetLobby: �l�b�g�v���C�T�[�o�[�́u�Ď��v�@�\��ǉ�
 �l�b�g�v���C�̃T�[�o�[�I����ʂŊĎ��@�\��ݒ�ł��܂��B
 �Ď��@�\��L���ɂ���ƁA���݉��l�̃v���C���[���I�����C���Ȃ̂���ʉ��ɂ��ł��\�������悤�ɂȂ�܂��B
 �v���C���[���̕\���F�́A�������������Ȃ��Ȃ�A�����ȊO�ɂ��N��NullpoMino���N�����Ă邯�ǒN�����r�[�ɂ��Ȃ��Ȃ��
 �N�����r�[�ɂ���Ȃ�Ԃŕ\������܂��B
+NetPlay: ���[���Œ�@�\��ǉ�(���[���쐬��ʂŗL���ɂ���Ƃ݂�Ȏ����Ɠ������[���Ńv���C���܂�)
+NetPlay: 2�l�ΐ�ő����NEXT��HOLD�\����ǉ�(�������܂����[���Œ�@�\���g���Ă���Ƃ��̂�)
+NetPlay: �������\���ǉ�(�������������o��ƃ��Z�b�g)
+NetPlay: 5���ȏ�T�[�o�[���牞�����Ȃ���Ύ����ؒf
+GRADE MANIA 3: �i�ʔF�莎���֘A�̃f�o�b�O���O���o�͂���悤��
-GRADE MANIA 3: Lv999�̃��[���𐶂��c�����Ƃ��ɒi�ʔF�莎���ɍ��i���Ă��F��i�ʂ��X�V����Ȃ��o�O�����Ԃ�C��

Version 6.5.0.1 (2010/04/02)
#�}�C�i�[�o�[�W�����A�b�v�ł��B�l�b�g�v���C�@�\��6.5�̃T�[�o�[�ƌ݊���������܂��B
+NetLobby: �e���X�g�{�b�N�X�ɉE�N���b�N���j���[�ǉ�
+NetPlay: ���݂̃v���C���[���\���Ȃǂ��Q�[����ʂɒǉ�
+Swing/NetPlay: Swing�łł��v���C���[�����Q�[����ʂɕ\�������悤�ɂȂ���
-Slick: "test.png"�Ƃ����g���Ă��Ȃ��摜���ǂݍ��܂�Ă����̂��C��(�����Y��orz)
*GRADE MANIA 3: �~�i�����Ȃǂ̃o�O�C��

Version 6.5 (2010/03/31)
+�l�b�g�v���C�ǉ�(����)
+VS-BATTLE:�ז��u���b�N�p�^�[���Ɂu1-ATTACK�v��ǉ�(NORMAL�����o���o���ɂȂ�ɂ���ONE RISE�����o���o���ɂȂ�₷��)
+VS-BATTLE:�uSE�v�I�v�V�����ǉ�(���ʉ�������)
-GRADE MANIA 3:��������������ƖڕW�i�ʂ��K��MM�ɂȂ�o�O�����Ԃ�C��(�C���x���Ă��߂�orz)
-RETRO MANIA:�X�R�A�E���C���E���x�����J���X�g���Ȃ��o�O���C��
-SDL/Slick:�ݒ��ʂ̃��C�����j���[�ō���������0P�ɂȂ�o�O���C��(Poochy���񂠂肪�Ƃ��I)
-Core:Field.getHighestPieceY(int)��Field.getValleyDepth(int)�̃o�O�����Ԃ�C��(Poochy���񂠂肪�Ƃ��I)
*Slick:�W���C�X�e�B�b�N�ݒ��ʂ̃{�^��������@��ύX(�����Ƒ����̃W���C�X�e�B�b�N�������悤�ɂȂ�������)
*Mac OS�p�W���C�X�e�B�b�N�֘A���C�u����(lib/libjinput-osx.jnilib)��Snow Leopard�Ή��̂��̂ɍ����ւ�
 (http://ariejan.net/2009/09/01/jinput-mac-os-x-64-bit-natives/)

Version 6.4 (2010/03/02)
+�~���[�W�b�N���X�g�G�f�B�^�ǉ� (���y�̐ݒ肪�ȒP��)
+GEM MANIA���[�h�ǉ� (���ׂĂ̕�΃u���b�N�������ƃX�e�[�W�N���A)
+MARATHON+���[�h�ǉ� (���x��20���N���A����ƃ{�[�i�X���x���o��)
+TIME ATTACK,CLASSIC MARATHON,FINAL���[�h��NullpoUE build 010210����ǉ�
+TIME ATTACK���[�h��BGM�Ή�
+TIME ATTACK�ɓ�ՓxBASIC�ǉ�
+TIME ATTACK��HELL�ɂ�萳�m��Hidden�M�~�b�N��ǉ�
+GRADE MANIA��GM�ɂȂ����Ƃ��Ƀ^�C���ɂ���Č��ʉ�ʂɕ]�����o��(NullpoUE build 010210)
+RETRO MANIA�ɁuPOWERON�v�I�v�V������ǉ� (�d���p�^�[���B���񓯂����ԂŃu���b�N�������Ă��܂�)
+SDL�ł�Slick�łɕ�΃u���b�N���������Ƃ��̃G�t�F�N�g��ǉ�
-Slick�łňꕔ�r�f�I�J�[�h�Ń��C�������G�t�F�N�g��������\�����������̂��C��
-Swing�łŔ������ȃu���b�N������ɕ`�悳��Ȃ��o�O���C��

Version 6.3 Beta (2010/01/02)
+CLASSIC MARATHON���[�h��FINAL���[�h��NullpoUE build 010210����ǉ�

Version 6.3 Alpha (2010/01/02)
*���O�o�͂�log4j���g���悤�ɁiDOS���͏o�Ȃ��Ȃ�܂�����Swing�ł�c�[���ނł��O�����C�u�������K�v�ɂȂ�܂����j
*�w�i��NullpoUE�̂��̂ɕύX�i�O�̔w�i��res/graphics/oldbg�ɂ���܂��j
*�u���b�N�摜��NullpoUE�̂��̂ɕύX�i�O�̃u���b�N�̓��[���G�f�B�^�őI���\�j
+NullpoUE build 010210�̃��[����ǉ�
+RETRO MANIA, PHANTOM MANIA, SCORE ATTACK���[�h��NullpoUE build 121909����ǉ�
+GRADE MANIA 3�Œi�ʎ�����ǉ��iNullpoUE���ǉ��j
+PRACTICE���[�h�̃��j���[�f�U�C���ύX
+PRACTICE���[�h��LEVEL TYPE��NONE�̂Ƃ��ɃS�[���ɂȂ郉�C������ݒ�\��
+PRACTICE���[�h��[]�u���b�N���g���ݒ��ǉ�
+PRACTICE���[�h�Ń��x���A�b�v����Ǝ��Ԑ��������Z�b�g����ݒ��ǉ�
+PRACTICE���[�h�ŏ����z�u�t�B�[���h���g����悤��
�i�t�B�[���h�G�f�B�b�g��ʂ̑��� UP/DOWN/LEFT/RIGHT:�J�[�\���ړ� A:�z�u B:�I�� C+LEFT/RIGHT:�F�I�� D:�폜�j
*���ɂ������������c

Version 6.2 (2009/10/29)
Swing�ł��i�ꉞ�j����
���[���G�f�B�^�̃u���b�N�̊G���̐ݒ���R���{�{�b�N�X�ɕύX���A�摜�����Ȃ���ݒ�ł���悤��
LWJGL��2.1.0�Ƀo�[�W�����A�b�v�i64bit�Ή��������ELinux��amd64�ł��T�E���h�����삷��悤�Ɂj
MARATHON���[�h��200���C���^�C�v��ǉ�
MANIA�n���[�h�Ő�s�z�[���h���g���ƃ��x���������Ȃ��o�O���C��(Thanks Zircean)
MANIA�n���[�h�ɗ��i�ʂ�ǉ�(Thanks Zircean)
PRACTICE���[�h�ŏo������u���b�N�̐ݒ��ǉ��i1�`3�̏������u���b�N���o��j
�G���[���O�������ƃt�@�C���ɏo�͂�����悤�Ƀo�b�`�t�@�C�����C��

Version 6.1 (2009/08/20)
�Ă�Mac OS X�œ����悤�ɂȂ�������
AI�Ń}���`�X���b�h���g��Ȃ��ݒ荀�ڂ�ǉ��i��Ƀf�o�b�O�p�BAI�͂������d���̂őΐ�ł͓K���܂���j
SPEED MANIA��GARBAGE MANIA�̃G���f�B���O��F�{�^��������������ƃG���f�B���O�̎c�莞�Ԃ̒Z�k���\��

Version 6 (2009/08/17)
���Ȃ�̕�������蒼��
TECHNICIAN���[�h��GARBAGE MANIA���[�h��VS-BATTLE���[�h��ǉ�
AI��ǉ��iCONFIG>AI SETTING����ON/OFF���\�ł��B���܂�T-Spin�͂��邯�ǎア�j
Slick�ł̃Q�[���p�b�h�@�\���b�蕜���i������@�𕡐�����I�ׂ܂��j
Swing�ł͖�肾�炯�Ȃ̂ň�U�����܂����i���[���G�f�B�b�g�@�\�̓��[���G�f�B�^�Ƃ��ēƗ����܂����j

Version 5.5 (2008/12/30)
SCORE RACE���[�h��ǉ�
���ʉ��Ɖ��y�̉��ʂ�ς���ݒ��ǉ�
�R���{�����Ƃ��̌��ʉ���ǉ�
SDL�łł�BGM�̃t�F�[�h�A�E�g�����퓮�삷��悤�ɏC��

Version 5.4+ (2008/11/29)
SDL�o�[�W������ǉ�
�Q�[���G���W���ɕύX�͂Ȃ��̂Ńo�[�W�����\�L��5.4�̂܂܂ł��B

Version 5.4 (2008/11/25)
GRADE MANIA 3���[�h��SPEED MANIA 2���[�h��ǉ�
���C�������G�t�F�N�g��ǉ��i�܂�Slick�ł̂݁BCONFIG��ʂ�OFF�ɂł��܂��j
Slick�łɂ��v���C���̃��[�h�����^�C�g���o�[�ɕ\������@�\��ǉ�

Version 5.3 (2008/10/29)
�����ߎ���̏�����ύX
CLASSIC�n�̃��[����BIG���[�h�ł̕ǏR��̎d�l��ύX�i1�}�X�������ꂽ�܂ܕǏR�肷��ƕǏR�������ꂽ�܂܂ɂȂ�܂��j
�u���b�N�̏o���ʒu��␳����I�v�V���������[���J�X�^�}�C�Y��ʂɒǉ�
���v���C�ǋL�@�\��ǉ��i���v���C���Ƀ|�[�Y����D�{�^���������Ǝ����Ńv���C�ł��܂��B���������ς������v���C�t�@�C���͏����T�C�Y�������܂��c�j

Version 5.2 (2008/10/05)
Slick�łŌ��ʉ��̃f�t�H���g��OFF�ɕύX�iOpenAL���������ł���������悤�Ɂj
Slick�łɂ��ő�FPS�̐ݒ��ǉ�
�t���[���X�e�b�v�@�\��ǉ��i�ݒ��ʂ�FRAME STEP��ON�ɂ���ƃ|�[�Y����F�{�^����������1�t���[�������Q�[�����i�݂܂��j
PRACTICE�ŃN���A���x����ݒ�ł���@�\��ǉ�
�z�[���h���g�p�����Ƃ���1�t���[�������ʂȎ��Ԃ��������Ă��܂��o�O���C��
�u���b�N���Œ肵���Ƃ��̌��鎞�Ԃ��ݒ����1�t���[���Z���Ȃ��Ă���o�O���C��

Version 5.1 (2008/09/19)
BIG���[�h�ǉ��i�u���b�N�s�[�X�̑傫��2�{�j
PRACTICE���[�h�Ń��x���^�C�v��I���ł���悤��
��s��]��F�����Ȃ����Ƃ�����o�O�����Ԃ�C��

Version 5.0 (2008/09/12)
�ύX�_���肷���Ďv���o���Ȃ�orz
Swing�o�[�W�����ǉ�
���[���J�X�^�}�C�Y�@�\�ǉ�
���v���C�̎d�l�ύX�i�ߋ��̃o�[�W�����ƌ݊����͂���܂���j
���v���C�ɃX�R�A��^�C�����L�^����悤�Ɂi�܂��g���Ă͂Ȃ��ł����j
�Q�[���p�b�h�ɏڂ����l�������܂ŃQ�[���p�b�h�p�~
�e���[�h�ɊȒP�ȃ����L���O��ǉ�

Version 4 (2008/08/10)
SPEED MANIA���[�h��ǉ�
�Q�[���p�b�h�̏\���{�^���̔�����@���܂��ύX
�G���[���O��log.txt�ɏo�͂���悤��play.bat��ύX�i�s���I��������log.txt���ǂ����K���ȃA�b�v���[�_�[�ɏグ�ĕ񍐂��Ă��������j

Version 3 (2008/08/05)
�Q�[���p�b�h�̏\���{�^���̔�����@��ύX�i�ǂ����{�^������Ȃ��ăX�e�B�b�N�łȂ��ƔF�����Ȃ����ۂ��̂Łj
GRADE MANIA 2���[�h��ǉ�
PRACTICE���[�h��ǉ��i���̂Ƃ��낽���̎��Ԗ�������ULTRA���[�h�j
���v���C�̗ʂ�������Ɖ�ʉ��̃��[�����ƃ��[�h���̕����ɏd�Ȃ�o�O���C��
���ɂ����낢�������C�����邯�ǖY�ꂽorz

Version 2 (2008/07/29)
��ʍ�����FPS�\���������ݒ��GAME OPTIONS�ɒǉ�
GRADE MANIA���[�h�ɁuLVSTOPSE�v�̐ݒ��ǉ��iON�ɂ����LV*99�����LV998�ɓ��B�����Ƃ���levelstop.wav����܂��j
�e���[�h�̃v���C��ʂɃ��[�h���̕\����ǉ�
�t�B�[���h���͂ރt���[���̐F�����[�h�ɂ���ĕς��悤��
�Q�[���p�b�h�̏\���{�^����F�����Ȃ��o�O�����Ԃ�C��
GRADE MANIA���[�h�Ńz�[���h���g�p�����Ƃ��ɂ����x���������Ă��܂��o�O���C��

Version 1.01 (2008/07/29) ���o�C�i���E�\�[�X�ɕύX�͂���܂���B�\����Version 1�̂܂܂ł��B
�Q�[���p�b�h���g�p���邽�߂ɕK�v�ȃ��C�u���������ĂȂ������̂��C��
Linux��Mac�𓮂������@��readme�ɒǉ�
�p���readme��ǉ�

Version 1 (2008/07/27)
�����J�i�܂��܂��e�X�g�Łj

�yTODO�z
�E�܂Ƃ��Ȑ����������
�ECONFIG��ʂ̐ݒ荀�ڂ̐��������
�ESwing�ł��Ȃɂ��܂Ƃ��ȕʂ̂��̂ɂ���
�EPRACTICE���[�h�̐ݒ荀�ڂ𑝂₷
�EAI����������
�E�p�Y�����[�h
�Ereadme_en.txt��TODO�����Ă�
