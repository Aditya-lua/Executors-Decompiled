/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x217c8c..0x217cc8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_217c8c_0 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_217c8c_0;

typedef struct st_217c8c_1 {
    char padding_0[88];
    struct st_217c8c_0 *field_58;
} st_217c8c_1;

typedef struct st_217c8c_2 {
    char padding_0[256];
    unsigned long long field_100;
} st_217c8c_2;

typedef struct st_217c8c_3 {
    char padding_0[96];
    struct st_217c8c_2 *field_60;
} st_217c8c_3;

extern st_217c8c_3 *g_f0d198;

int sub_217c8c(st_217c8c_1 *a0)
{
    st_217c8c_0 *v0;  // x9

    v0 = a0->field_58;
    v0->field_0 = ((unsigned int)g_f0d198->field_60->field_100 * 0x20000000 | (unsigned int)(g_f0d198->field_60->field_100 >> 35)) & 3758096385 & 1;
    v0->field_c = 1;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
