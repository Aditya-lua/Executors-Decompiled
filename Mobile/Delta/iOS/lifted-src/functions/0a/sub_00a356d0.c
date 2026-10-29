/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa356d0..0xa357a0 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a356d0_2 {
    char padding_0[184];
    unsigned long long field_b8;
} st_a356d0_2;

typedef struct st_a356d0_1 {
    char padding_0[512];
    char field_200;
    char padding_201[191];
    unsigned int field_2c0;
} st_a356d0_1;

typedef struct st_a356d0_0 {
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
} st_a356d0_0;


void sub_a356d0(st_a356d0_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    char i;  // x21
    st_a356d0_2 *iter;  // x22
    st_a356d0_1 *v18;  // x24
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    i = 0;
    iter = &a0->field_180;
    do
    {
        v18 = &a0->padding_0[i];
        if (v18->field_200 & 1)
            sub_a6c2e4(*(long long *)(&iter->padding_0[0] - 128), "crypto/err/err_local.h", 25);
        *(unsigned long long *)(&iter->padding_0[0] - 128) = 0;
        *(unsigned long long *)&iter->padding_0[0] = 0;
        *(unsigned int *)&v18->field_200 = 0;
        *(unsigned int *)&v18->padding_0[64] = 0;
        *(unsigned int *)&v18->padding_0[0] = 0;
        *(unsigned long long *)(&iter->padding_0[0] - 0x100) = 0;
        v18->field_2c0 = 0xffffffff;
        sub_a6c2e4(*(long long *)&iter[1].padding_0[0], "crypto/err/err_local.h", 92);
        *(unsigned long long *)&iter[1].padding_0[0] = 0;
        sub_a6c2e4(*(long long *)&iter[2].padding_0[0], "crypto/err/err_local.h", 94);
        *(unsigned long long *)&iter[2].padding_0[0] = 0;
        iter = &iter->padding_0[8];
        i += 4;
    } while (i != 64);
    sub_a6c2e4();
    return;
}
