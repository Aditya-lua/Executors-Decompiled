/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a86c..0x3a988 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a86c_1 {
    char padding_0[40];
    long long field_28;
} st_3a86c_1;

typedef struct st_3a86c_0 {
    char field_0;
} st_3a86c_0;

extern unsigned long long g_e66220;
extern unsigned long long g_e66228;

void sub_3a86c(long long a0, st_3a86c_1 *a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // x0
    st_3a86c_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_3a86c_0 *v1;  // [bp-0x70]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    v14 = sub_42480();
    if (!(v14 >> 31 & 1))
    {
        sub_47e48(a0, a1->field_28, (unsigned int)v14 & 0xff, 0);
        goto *((void *)(g_e66220));
    }
    else
    {
        goto *((void *)(g_e66228));
    }
}
