/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa69060..0xa69148 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void* sub_a69060(void* a0, void* a1, void* a2)
{
    void* v9;  // x20
    void* v10;  // x19
    char *iter;  // x8
    void* v12;  // x20
    void* v13;  // w9
    void* v14;  // x9
    void* v15;  // w10
    unsigned long v0;  // [bp-0x78]
    void* *v1;  // [bp-0x70]
    void* v2;  // [bp-0x68], Other Possible Types: char
    void* v3;  // [bp-0x58]
    void* v4;  // [bp-0x48]
    void* v5;  // [bp-0x38]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a2;
    v10 = a1;
    v6 = *(long long *)&g_10002b0;
    if (a0 || (a0 = sub_a68f38(), a0))
    {
        iter = &v2;
        v5 = (void*)0;
        v4 = (void*)0;
        v3 = (void*)0;
        v2 = (void*)0;
        v0 = 64;
        v1 = &v2;
        if (63 >= v9)
        {
            if (v10 && v9)
            {
                do
                {
                    v12 = v9;
                    v13 = (void*)*(char *)v10;
                    v10 += 1;
                } while (v13 && (*iter = (char)v13 & 223, iter += 1, v9 = v12 - 1, v12 != 1));
            }
        }
        else
        {
            if (v10)
            {
                v14 = 0;
                do
                {
                    v15 = (void*)*(char *)(v10 + v14);
                } while (v15 && (*(char *)(&v2 + v14) = (char)v15 & 223, v14 += 1, v14 != 63));
            }
        }
        a0 = sub_a63e6c((long long)a0[8], &v0);
        if (a0)
            a0 = *(int *)a0;
    }
    if (*(long long *)&g_10002b0 == v6)
        return a0;
    ___stack_chk_fail();
}
