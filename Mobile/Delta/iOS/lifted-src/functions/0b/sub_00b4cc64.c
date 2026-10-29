/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4cc64..0xb4cd9c (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b4cc64(void* a0, unsigned long a1, unsigned long long *a2, long long a3, long long a4, long long a5)
{
    unsigned long v5;  // x0
    unsigned long long v6;  // x0
    unsigned int v0;  // [bp-0x7c]
    char v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if ((int)a0[24] == 0x4000)
    {
        if (a1)
        {
            if ((int)sub_a3fe10((long long)a0[360], a4, a5) < 1)
                goto LABEL_b4cd68;
            v0 = 0;
            v5 = sub_a2f9e0();
            if ((unsigned int)v5)
            {
                v5 = (long long)a0[360];
                if (v5)
                {
                    v5 = sub_a3ff7c(v5, &v1, &v0);
                    if ((unsigned int)v5)
                        v5 = sub_b4db74(a0, a1, a2, a3, &v1, v0);
                }
            }
        }
        else
        {
            v5 = sub_a2f9e0();
            if ((unsigned int)v5)
            {
                if ((long long)a0[360])
                {
                    v6 = sub_a16b20((long long)a0[16]);
                    v5 = sub_a2f9e0(v6);
                    if ((unsigned int)v5)
                    {
                        *a2 = (int)v6;
                        v5 = 1;
                    }
                }
                else
                {
LABEL_b4cd68:
                    v5 = 0;
                }
            }
        }
        if (*(long long *)&g_10002b0 == v2)
            return v5;
    }
    else if (*(long long *)&g_10002b0 == v2)
    {
        return sub_b4db74();
    }
    ___stack_chk_fail();
}
