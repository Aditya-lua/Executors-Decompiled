/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9c9fc..0xa9cc1c (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a9c9fc(long long *a0, long long a1, unsigned long long *a2, unsigned long long a3, long long a4)
{
    long long v6;  // x1
    unsigned long long v7;  // x0
    long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x21
    unsigned long v11;  // x8
    unsigned long long v12;  // x0
    unsigned int v0;  // [bp-0x49c]
    char v1;  // [bp-0x498]
    char v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v0 = *a2;
    if ((int)v0 >= -0x80000000)
    {
        sub_a368c8();
        sub_a369bc("crypto/pem/pem_lib.c", 457, "PEM_do_header");
        v6 = 128;
        goto LABEL_a9ca60;
    }
    else
    {
        if (*a0)
        {
            if (a3)
                a3();
            v7 = sub_a9be54(&v1, 0x400, 0, a4);
            if (!(v7 >> 31 & 1))
            {
                v8 = sub_a55e90();
                v9 = sub_a4f5b4(*a0, v8, a0 + 1, &v1, v7, 1, &v2, 0);
                if ((unsigned int)v9)
                {
                    v9 = sub_a4bc70();
                    if (v9)
                    {
                        v10 = v9;
                        if (sub_a4d058() && sub_a4c6b0(v10, a1, &v0, a1, v0) && !(v11 = v0, *a2 = v11, v12 = sub_a4cc84(v10, a1 + v11, &v0), !(unsigned int)v12))
                        {
                            v9 = v12;
                            *a2 = *a2 + v0;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/pem/pem_lib.c", 496, "PEM_do_header");
                            sub_a36abc(9, 101, 0);
                            v9 = 0;
                        }
                        sub_a4bca0(v10);
                        sub_a66ec0(&v1, 0x400);
                        sub_a66ec0(&v2, 64);
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/pem/pem_lib.c", 469, "PEM_do_header");
                v6 = 104;
LABEL_a9ca60:
                sub_a36abc(9, v6, 0);
                v9 = 0;
            }
        }
        else
        {
            v9 = 1;
        }
        if (*(long long *)&g_10002b0 == v3)
            return v9;
        ___stack_chk_fail();
    }
}
