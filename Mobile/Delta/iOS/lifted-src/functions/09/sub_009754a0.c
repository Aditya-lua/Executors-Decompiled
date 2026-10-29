/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9754a0..0x97559c (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9754a0_3 {
    struct st_9754a0_0 *field_0;
    char padding_8[16];
    long long field_18;
    char padding_20[232];
    struct st_9754a0_2 *field_108;
    char padding_110[128];
    unsigned long long field_190;
    char padding_198[50];
    int field_1ca;
} st_9754a0_3;

typedef struct st_9754a0_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    char field_20;
    char padding_21[23];
    struct st_9754a0_1 *field_38;
} st_9754a0_0;

typedef struct st_9754a0_1 {
    unsigned long long field_0;
} st_9754a0_1;

typedef struct st_9754a0_2 {
    char padding_0[96];
    struct st_9754a0_1 *field_60;
} st_9754a0_2;


long long sub_9754a0(st_9754a0_3 *a0, unsigned int a1)
{
    unsigned long v2;  // x21
    unsigned long v3;  // x22
    st_9754a0_3 *ptr;  // x23
    char v5;  // x8
    st_9754a0_3 *v6;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &(a0->padding_198)[1 + 1];
    v3 = a1;
    if (*(char *)(v2 + v3))
        return 0;
    if (a1 == 1)
        (a0->padding_198)[1] = 1;
    ptr = (char *)a0 + (unsigned int)v3 * 48;
    v5 = (char)ptr->field_0;
    if (!v5)
    {
        sub_a66664(ptr->field_18);
        memset(ptr, 0, 32);
        sub_991a44(&(&a0->field_0)[4 * v3 + 18]);
        v6 = &(&a0->field_0)[v3];
        *(unsigned long long *)&v6->padding_110[40] = 0;
        *(unsigned long long *)&v6->padding_110[64] = 0;
        *(unsigned int *)&a0->padding_110[8] = 0;
        *(char *)(v2 + v3) = 1;
        *(unsigned long long *)&v6->padding_198[0] = 0;
        sub_974dcc(a0);
        return 1;
    }
    if ((char)(*(char *)(v5 + 32)) >> 2 & 1)
        a0->field_190 = a0->field_190 - *(long long *)(v5 + 8);
    (*(long long *)(v5 + 56))();
}
