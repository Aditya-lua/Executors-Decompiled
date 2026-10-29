/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68e7c..0xa68f38 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void* sub_a68e7c(void* a0, void* a1)
{
    void* v9;  // x9
    void* v10;  // w10
    unsigned long v0;  // [bp-0x78]
    void* *v1;  // [bp-0x70]
    void* v2;  // [bp-0x68]
    void* v3;  // [bp-0x58]
    void* v4;  // [bp-0x48]
    void* v5;  // [bp-0x38]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if (a0 || (a0 = sub_a68f38(), a0))
    {
        v5 = (void*)0;
        v4 = (void*)0;
        v3 = (void*)0;
        v2 = (void*)0;
        v0 = 64;
        v1 = &v2;
        if (a1)
        {
            v9 = 0;
            do
            {
                v10 = (void*)*(char *)(a1 + v9);
            } while (v10 && (*(char *)(&v2 + v9) = (char)v10 & 223, v9 += 1, v9 != 63));
        }
        a0 = sub_a63e6c((long long)a0[8], &v0);
        if (a0)
            a0 = *(int *)a0;
    }
    if (*(long long *)&g_10002b0 == v6)
        return a0;
    ___stack_chk_fail();
}
