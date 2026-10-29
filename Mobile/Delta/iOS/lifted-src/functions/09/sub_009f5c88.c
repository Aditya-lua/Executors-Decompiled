/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5c88..0x9f5df0 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000280;

unsigned int sub_9f5c88(unsigned int a0, long long a1, unsigned int a2, unsigned long long *a3, unsigned long a4)
{
    unsigned int v2;  // x23
    unsigned long v3;  // x0
    unsigned int ptr;  // x24
    unsigned int v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_mod.c", 731, "CONF_parse_list");
        sub_a36abc(14, 115, 0);
        return 0;
    }
    v2 = a0;
    if (a2)
    {
        v3 = *(char *)v2;
        if ((unsigned int)v3)
        {
            do
            {
                if (!(v3 >> 7 & 1))
                {
                    if (!(*(int *)&(&g_1000280)[60 + 4 * (v3 & 0xffffffff)] & 0x4000))
                        break;
                }
                else
                {
                    if (!___maskrune())
                        break;
                }
            } while ((v3 = *(char *)(v2 + 1), v2 += 1, (unsigned int)v3));
        }
    }
    ptr = _strchr(v2, a1);
    if (ptr != v2 && *(char *)v2)
    {
        if (ptr)
        {
            if (a2)
                goto LABEL_9f5d60;
LABEL_9f5d44:
        }
        else
        {
            ptr = v2 + _strlen(v2);
            if (!a2)
                goto LABEL_9f5d44;
            while (1)
            {
LABEL_9f5d60:
                v5 = *(char *)(ptr - 1);
                if (v5 < 0)
                {
                    ptr -= 1;
                    if (!___maskrune(v5 & 0xff, 0x4000))
                        break;
                }
                else
                {
                    ptr -= 1;
                    if (!(*(int *)&(&g_1000280)[60 + 4 * v5] & 0x4000))
                        break;
                }
            }
        }
    }
    a3();
}
