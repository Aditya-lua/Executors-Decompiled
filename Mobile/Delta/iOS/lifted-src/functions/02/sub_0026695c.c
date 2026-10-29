/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x26695c..0x2669f4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_26695c_0 {
    char padding_0[40];
    long long field_28;
} st_26695c_0;

extern unsigned long long g_f0d280;
extern unsigned long long g_f0d528;

void sub_26695c(unsigned long a0, unsigned long a1, unsigned long a2, st_26695c_0 **a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    if (sub_2a3e68(*a3->field_28, 0, 0))
        sub_d5c30(*a3->field_28, g_f0d528 + 5158);
    goto *((void *)(g_f0d280));
}
