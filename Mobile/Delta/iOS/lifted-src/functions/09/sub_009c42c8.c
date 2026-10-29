/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c42c8..0x9c44a0 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c42c8_0 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_9c42c8_0;

extern st_9c42c8_0 g_d2c130;
extern char g_10002b0;

unsigned int sub_9c42c8(unsigned long long a0, unsigned int a1, unsigned int a2, unsigned long long *a3, unsigned long a4)
{
    unsigned long long v6;  // x8
    unsigned long long v0;  // [bp-0x60]
    char v1;  // [bp-0x4c]
    char v2;  // [bp-0x4b]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (a0 > 0xffffffff)
    {
        if (*(long long *)&g_10002b0 == v3)
            return 0xffffffff;
        ___stack_chk_fail();
    }
    else
    {
        if (a0 >= 0x10000)
        {
            v0 = a0;
            sub_9d5b44(&v2, 19, "\\W%08lX");
        }
        else if (a0 >= 0x100)
        {
            v0 = a0;
            sub_9d5b44(&v2, 19, "\\U%04lX");
        }
        else
        {
            v1 = a0;
            if (a0 >= 128)
                v6 = a1 & 4;
            else
                v6 = (&g_d2c130.field_0)[a0] & a1;
            if ((unsigned int)v6 & 97)
            {
                if (!(v6 >> 3 & 1))
                {
                    a3();
                }
                else if (a2)
                {
                    *(char *)a2 = 1;
                    a3();
                }
                else
                {
                    a3();
                }
            }
            else
            {
                if ((unsigned int)v6 & 1030)
                {
                    v0 = a0;
                    sub_9d5b44(&v2, 11, "\\%02X");
                }
                else if (a0 != 92)
                {
                    a3();
                }
                else if (!(a1 & 1039))
                {
                    a3();
                }
            }
        }
        a3();
    }
}
