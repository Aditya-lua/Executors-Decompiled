/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3709c..0xa37190 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3709c_2 {
    char padding_0[184];
    unsigned long long field_b8;
} st_a3709c_2;

typedef struct st_a3709c_1 {
    char padding_0[512];
    char field_200;
    char padding_201[191];
    unsigned int field_2c0;
} st_a3709c_1;

typedef struct st_a3709c_0 {
    char padding_0[256];
    long long field_100;
    char padding_108[120];
    char field_180;
    char padding_181[7];
    char field_188;
    char padding_189[183];
    long long field_240;
    char padding_248[184];
    long long field_300;
} st_a3709c_0;


void sub_a3709c(st_a3709c_0 *a0)
{
    char i;  // x21
    st_a3709c_2 *iter;  // x22
    st_a3709c_1 *v4;  // x24
    char v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    i = 0;
    iter = &a0->field_180;
    do
    {
        v4 = &a0->padding_0[i];
        if (v4->field_200 & 1)
            sub_a6c2e4(*(long long *)(&iter->padding_0[0] - 128), "crypto/err/err_local.h", 25);
        *(unsigned long long *)(&iter->padding_0[0] - 128) = 0;
        *(unsigned long long *)&iter->padding_0[0] = 0;
        *(unsigned int *)&v4->field_200 = 0;
        *(unsigned int *)&v4->padding_0[64] = 0;
        *(unsigned int *)&v4->padding_0[0] = 0;
        *(unsigned long long *)(&iter->padding_0[0] - 0x100) = 0;
        v4->field_2c0 = 0xffffffff;
        sub_a6c2e4(*(long long *)&iter[1].padding_0[0], "crypto/err/err_local.h", 92);
        *(unsigned long long *)&iter[1].padding_0[0] = 0;
        sub_a6c2e4(*(long long *)&iter[2].padding_0[0], "crypto/err/err_local.h", 94);
        *(unsigned long long *)&iter[2].padding_0[0] = 0;
        iter = &iter->padding_0[8];
        i += 4;
    } while (i != 64);
    v5 = sub_a35bc0();
    if (!v5)
        return;
    _memcpy(a0, v5, 904);
}
