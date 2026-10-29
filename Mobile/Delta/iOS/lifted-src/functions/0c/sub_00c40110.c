/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc40110..0xc40714 (1540 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c40110_0 {
    unsigned long long field_0;
} st_c40110_0;

extern long long g_be768c;
extern unsigned long long g_c409b8;
extern st_c40110_0 *g_f0b1f8;

void sub_c40110(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v21;  // x28
    unsigned long long v22;  // x27
    unsigned long long v31;  // x30
    long long v32;  // x0
    unsigned long long v33;  // 4102
    long long v34;  // x0
    unsigned long long v23;  // x26
    unsigned long long v24;  // x25
    unsigned long long v25;  // x24
    unsigned long long v26;  // x23
    unsigned long long v27;  // x22
    unsigned long long v28;  // x21
    unsigned long long v29;  // x20
    unsigned long long v30;  // x19
    unsigned long v0;  // [bp-0xe8]
    unsigned long long v1;  // [bp-0xe0]
    unsigned long v2;  // [bp-0xd8]
    char *v3;  // [bp-0xc0]
    unsigned long long v4;  // [bp-0xb8]
    char *v5;  // [bp-0xb0]
    long long v6;  // [bp-0xa8]
    unsigned long v7;  // [bp-0x80]
    unsigned long long v8;  // [bp-0x60]
    unsigned long long v9;  // [bp-0x58]
    unsigned long long v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x48]
    unsigned long long v12;  // [bp-0x40]
    unsigned long long v13;  // [bp-0x38]
    unsigned long long v14;  // [bp-0x30]
    unsigned long long v15;  // [bp-0x28]
    unsigned long long v16;  // [bp-0x20]
    unsigned long long v17;  // [bp-0x18]
    char *v18;  // [bp-0x10]
    unsigned long long v19;  // [bp-0x8]
    char v20;  // [bp+0x0]

    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = &v20;
    v19 = v31;
    v0 = a0;
    v1 = a1;
    v2 = a2;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((long long)/* unsupported instruction */ >= 0)
        g_f0b1f8();
    v3 = &v2;
    v4 = &g_c409b8;
    v5 = &v0;
    v6 = &g_be768c;
    v7 = sub_c600d8();
    v32 = sub_c769bc(sub_c40ab4(&v7));
    if (v6)
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v33 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v33 & 1))
            sub_c601f0();
    }
    v34 = sub_c73e0c(__Unwind_Resume(v32));
    sub_c7698c(v34);
    __debugbreak();
}
