/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7308..0x9f761c (788 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;
extern char g_10002b0;

unsigned long long sub_9f7308(void* a0, long long a1, unsigned long long a2, long long a3)
{
    long long v7;  // x0
    unsigned long v8;  // x24
    long long v9;  // x0
    long long v10;  // x22
    unsigned long long v11;  // x0
    unsigned long long v0;  // [bp-0x90], Other Possible Types: unsigned long
    unsigned long v1;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x80]
    char v3;  // [bp-0x6c]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if (a3)
        v7 = sub_9f6548(a3, (long long)a0[24], (long long)a0[32]);
    else
        v7 = 0;
    v0 = a2;
    v1 = &g_c7c2eb;
    sub_9d524c(a1, "%*sSigned Certificate Timestamp:");
    v8 = (unsigned int)a2 + 4;
    v0 = v8;
    v1 = &g_c7c2eb;
    sub_9d524c(a1, "\n%*sVersion   : ");
    if (*(int *)a0)
    {
        v0 = (unsigned int)a2 + 16;
        v1 = &g_c7c2eb;
        sub_9d524c(a1, "unknown\n%*s");
        if (*(long long *)&g_10002b0 == v4)
            return sub_9d397c();
    }
    else
    {
        sub_9d524c(a1, "v1 (0x0)");
        if (v7)
        {
            v1 = &g_c7c2eb;
            v2 = sub_c4ba8(v7);
            v0 = v8;
            sub_9d524c(a1, "\n%*sLog       : %s");
        }
        v0 = v8;
        v1 = &g_c7c2eb;
        sub_9d524c(a1, "\n%*sLog ID    : ");
        sub_9d397c(a1, (unsigned int)a2 + 16, 16, (long long)a0[24], (int)a0[32]);
        v0 = v8;
        v1 = &g_c7c2eb;
        v9 = sub_9cf194(sub_9d524c(a1, "\n%*sTimestamp : "), "\n%*sTimestamp : ");
        if (v9)
        {
            v10 = v9;
            sub_9c0e70();
            v0 = sub_c4c40(v10);
            v1 = (long long)a0[40] - 1000 * ((unsigned long long)((long long)a0[40]) >> 3) / 125;
            sub_9d5b44(&v3, 20, "%.14s.%03dZ");
            if (sub_9c0e08(v10, &v3))
                sub_9c0ef0(a1, v10);
            sub_9cf0f4(v10);
        }
        v0 = v8;
        v1 = &g_c7c2eb;
        sub_9d524c(a1, "\n%*sExtensions: ");
        if ((long long)a0[56])
            sub_9d397c(a1, (unsigned int)a2 + 16, 16, (long long)a0[48]);
        else
            sub_9d524c(a1, "none");
        v0 = v8;
        v1 = &g_c7c2eb;
        sub_9d524c(a1, "\n%*sSignature : ");
        if (sub_9f7814(a0))
        {
            v0 = sub_a99788();
        }
        else
        {
            v0 = (char)a0[64];
            v1 = (char)a0[65];
        }
        sub_9d524c(a1);
        v0 = v8;
        v1 = &g_c7c2eb;
        sub_9d524c(a1, "\n%*s            ");
        v11 = sub_9d397c(a1, (unsigned int)a2 + 16, 16, (long long)a0[72], (int)a0[80]);
        if (*(long long *)&g_10002b0 == v4)
            return v11;
    }
    ___stack_chk_fail();
}
