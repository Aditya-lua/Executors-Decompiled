/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa51314..0xa513e8 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a51430;
extern long long g_e9de50;
extern void* g_f12a38;

void* sub_a51314(unsigned int a0, void* a1, void* a2, void* a3, void* a4, void* a5)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    long long v18;  // x0
    void* v19;  // x0
    unsigned int v0;  // [bp-0x60]
    void* v1;  // [bp-0x5c]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!a1)
        return 0;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    v0 = a0;
    v1 = a1;
    if (g_f12a38)
    {
        sub_ad6ae4(g_f12a38);
        v18 = sub_ad66d4(g_f12a38, &v0);
        v19 = sub_ad69f8(g_f12a38, v18);
        if (v19)
            goto LABEL_a51394;
    }
    v19 = sub_a99ef4(&v0, &g_e9de50, 0x22, 32, &g_a51430);
    if (!v19)
        return v19;
LABEL_a51394:
    if (a2)
        *(int *)a2 = (int)v19[8];
    if (a3)
        *(int *)a3 = (int)v19[12];
    if (a4)
        *(long long *)a4 = (long long)v19[16];
    if (!a5)
        return 1;
    *(long long *)a5 = (long long)v19[24];
    return 1;
}
