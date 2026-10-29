/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x167360..0x167570 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_167360_7 {
    unsigned long long field_0;
    struct st_167360_5 *field_8;
} st_167360_7;

typedef struct st_167360_4 {
    struct st_167360_5 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_167360_4;

typedef struct st_167360_6 {
    unsigned long long field_0;
} st_167360_6;

typedef struct st_167360_5 {
    char padding_0[80];
    struct st_167360_6 *field_50;
    struct st_167360_4 *field_58;
} st_167360_5;

typedef struct st_167360_0 {
    char field_0;
} st_167360_0;

typedef struct st_167360_2 {
    char padding_0[257];
    char field_101;
} st_167360_2;

typedef struct st_167360_8 {
    char padding_0[280];
    struct st_167360_6 *field_118;
} st_167360_8;

typedef struct st_167360_3 {
    char padding_0[96];
    struct st_167360_2 *field_60;
} st_167360_3;

extern long long g_f01360;
extern st_167360_3 *g_f0d198;
extern st_167360_8 *g_f0d3d8;

void sub_167360(st_167360_5 *a0)
{
    unsigned long long v13;  // x24
    unsigned long long *v14;  // x23
    long long v23;  // x0
    long long v24;  // x0
    long long v25;  // x0
    long long v26;  // x0
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    void* v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    char v20;  // x0
    st_167360_7 *v21;  // x0
    st_167360_4 *v22;  // x8
    st_167360_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_167360_0 *v1;  // [bp-0x58]
    st_167360_0 **v2;  // [bp-0x50], Other Possible Types: char
    st_167360_0 *v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long *v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    void* v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = &v12;
    v11 = v19;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v20 = sub_e21e0(a0, 1);
        if (v20 && *(long long *)(v20 + 24))
        {
            v21 = operatornew(24);
            *(unsigned long long *)a0->field_50 = 0xffffffffffffffff;
            v21->field_8 = a0;
            v21->field_0 = sub_91ed04(a0);
            v22 = a0->field_58;
            v22->field_0 = a0;
            v22->field_c = 10;
            a0->field_58 = a0->field_58 + 1;
            g_f0d3d8->field_118();
        }
    }
    v23 = sub_c60d64(a0);
    sub_e6bb4(&v3, 0);
    v24 = __Unwind_Resume(v23);
    std::__1::mutex::unlock(&g_f01360);
    sub_e6bb4(&v3, 0);
    v25 = __Unwind_Resume(v24);
    sub_e6bb4(&v3, 0);
    v26 = __Unwind_Resume(v25);
    *v14 = v13;
    operatordelete(v17);
    __Unwind_Resume(v26);
}
