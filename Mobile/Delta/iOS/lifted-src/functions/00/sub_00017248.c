/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x17248..0x1739c (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_17248_1 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    long long field_80;
    unsigned long long field_84;
    unsigned long long field_8c;
    char padding_94[20];
    unsigned long long field_a8;
    char padding_b0[40];
    long long field_d8;
} st_17248_1;

typedef struct st_17248_0 {
    char field_0;
} st_17248_0;

extern unsigned long long g_e61ee8;
extern unsigned long long g_e61ef0;

long long sub_17248(st_17248_1 *a0)
{
    long long v8;  // x0
    unsigned long v9;  // x23
    unsigned long long v10;  // x22
    long long v11;  // x0
    st_17248_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_17248_0 *v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x58]
    long long v4;  // [bp-0x4c]
    unsigned long v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if ((int)a0->field_80 != 40)
        return sub_1d794(a0, "expression");
    v4 = (int)a0->field_80;
    v5 = *(long long *)((char *)&a0->field_80 + 4);
    sub_f8d0(a0);
    v8 = sub_18934(a0, 0);
    if ((int)a0->field_80 == 41)
    {
        v9 = *(long long *)((char *)&a0->field_84 + 4);
        sub_f8d0(a0);
        v10 = g_e61ef0;
    }
    else
    {
        sub_ed8c();
        v9 = *(long long *)&a0->padding_94[16];
        v10 = g_e61ee8;
    }
    v2 = *(long long *)((char *)&a0->field_80 + 4);
    v3 = v9;
    v11 = sub_404c(*(long long *)&a0->padding_b0[32], 40);
    sub_531c(v11, &v2, v8);
    if (a0->field_58 != 1)
        return v11;
    goto *((void *)(v10));
}
