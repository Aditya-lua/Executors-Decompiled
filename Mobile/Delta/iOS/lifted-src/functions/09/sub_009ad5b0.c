/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ad5b0..0x9ad744 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ad5b0_3 {
    char padding_0[8];
    struct st_9ad5b0_2 *field_8;
} st_9ad5b0_3;

typedef struct st_9ad5b0_5 {
    char padding_0[264];
    unsigned long long field_108;
    char padding_110[992];
    struct st_9ad5b0_4 *field_4f0;
    char padding_4f8[1920];
    struct st_9ad5b0_0 *field_c78;
    char padding_c80[8];
    unsigned long long field_c88;
} st_9ad5b0_5;

typedef struct st_9ad5b0_4 {
    char padding_0[288];
    long long field_120;
    char padding_128[16];
    char field_138;
    char padding_139[7];
    unsigned long long field_140;
    unsigned short field_148;
    char padding_14a[6];
    struct st_9ad5b0_3 *field_150;
    unsigned long long field_158;
    char padding_160[108];
    struct st_9ad5b0_3 *field_1cc;
} st_9ad5b0_4;

typedef struct st_9ad5b0_2 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    unsigned short field_10;
    char padding_12[14];
    unsigned long long field_20;
    struct st_9ad5b0_3 *field_28;
    struct st_9ad5b0_0 *field_30;
    unsigned long long field_38;
} st_9ad5b0_2;

typedef struct st_9ad5b0_1 {
    unsigned long long field_0;
} st_9ad5b0_1;

typedef struct st_9ad5b0_0 {
    char padding_0[88];
    struct st_9ad5b0_1 *field_58;
} st_9ad5b0_0;

extern char g_10002b0;

st_9ad5b0_3 * sub_9ad5b0(st_9ad5b0_5 *a0, unsigned int a1, st_9ad5b0_3 **a2)
{
    st_9ad5b0_3 *v6;  // x0
    st_9ad5b0_2 *v7;  // x20
    st_9ad5b0_3 *v8;  // x22
    unsigned long long v9;  // x8
    unsigned short v10;  // x10
    unsigned long long v11;  // x11
    st_9ad5b0_4 *v12;  // x12
    st_9ad5b0_0 *v13;  // x8
    unsigned long long v14;  // x0
    st_9ad5b0_3 *v0;  // [bp-0x50]
    char v1;  // [bp-0x4a]
    char v2;  // [bp-0x49]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v0 = 0;
    v1 = a1 >> 8;
    v2 = a1;
    v6 = sub_954360(a0->field_4f0->field_120, &v0);
    if (!v6)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_dtls.c", 1205, "dtls1_retransmit_message");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        *(unsigned int *)a2 = 0;
        if (*(long long *)&g_10002b0 == v3)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        *(unsigned int *)a2 = 1;
        v7 = v6->field_8;
        if (!(int)v7->field_28)
            v8 = 12;
        else
            v8 = 1;
        _memcpy();
        v9 = v7->field_8;
        a0->field_108 = &v8->padding_0[v9];
        v10 = v7->field_10;
        v11 = v7->field_20;
        v12 = a0->field_4f0;
        v12->field_138 = v7->field_0;
        v12->field_140 = v9;
        v12->field_148 = v10;
        v12->field_150 = 0;
        v12->field_158 = v11;
        *(unsigned int *)&(v12->padding_160)[1] = 1;
        v13 = v7->field_30;
        v14 = v7->field_38;
        a0->field_c78 = v13;
        a0->field_c88 = v14;
        v13->field_58();
    }
}
