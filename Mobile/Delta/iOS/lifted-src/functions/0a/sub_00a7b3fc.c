/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b3fc..0xa7b524 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7b3fc_0 {
    unsigned int field_0;
    char padding_4[20];
    unsigned long long field_18;
} st_a7b3fc_0;

extern char g_10002b0;

void sub_a7b3fc(st_a7b3fc_0 *a0)
{
    unsigned long long v5;  // x21
    unsigned long idx;  // x8
    unsigned long long v7;  // x0
    unsigned long long v8;  // x8
    unsigned long v0;  // [bp-0x108]
    unsigned long long v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (a0)
    {
        v5 = 0;
        v1 = 0;
        v0 = a0->field_18;
        do
        {
            idx = *(int *)((char *)&v1 + 4 * (v5 & 0xffffffff));
            v7 = (&v0)[v5 & 0xffffffff];
            if ((int)idx >= 16)
            {
                if (v7)
                    sub_a6c2e4();
                v5 = (unsigned int)v5 - 1;
            }
            else
            {
                *(unsigned int *)((char *)&v1 + 4 * (v5 & 0xffffffff)) = (unsigned int)idx + 1;
                if (v7)
                {
                    v8 = *(long long *)(v7 + idx * 8);
                    if (v8 && (int)(a0->field_0 - 1) > (int)v5)
                    {
                        v5 = (unsigned int)v5 + 1;
                        *(unsigned int *)((char *)&v1 + 4 * (v5 & 0xffffffff)) = 0;
                        (&v0)[v5 & 0xffffffff] = v8;
                    }
                }
            }
        } while (!(v5 >> 31 & 1));
        if (*(long long *)&g_10002b0 == v2)
        {
            sub_a6c2e4();
            return;
        }
    }
    else if (*(long long *)&g_10002b0 == v2)
    {
        return;
    }
    ___stack_chk_fail();
}
