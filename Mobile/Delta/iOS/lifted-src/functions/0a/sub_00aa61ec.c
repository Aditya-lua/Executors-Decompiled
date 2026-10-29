/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa61ec..0xaa63c0 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

int sub_aa61ec(long long a0, char **a1, unsigned int *a2)
{
    char *iter;  // x23
    unsigned long v6;  // x22
    unsigned long node;  // x25
    unsigned int v8;  // w24
    unsigned long v9;  // x0
    char *v11;  // x23
    char *v12;  // x23
    char *v13;  // x23
    char *v0;  // [bp-0xe0]
    unsigned int v1;  // [bp-0xcc]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    iter = *a1;
    if (sub_a6994c(*iter, 3))
    {
        v6 = 0;
        node = 0;
        v8 = 0;
        do
        {
            iter += 2;
            while (1)
            {
                if (98 >= node)
                {
                    *((char *)&v1 + node) = sub_a69994(*(iter - 2));
                    node += 1;
                }
                else
                {
                    v8 = 1;
                }
                v9 = *(iter - 1);
                if ((unsigned int)v9 != 95 && !sub_a6994c(v9, 7))
                    break;
                iter += 1;
            }
            if (*(iter - 1) != 46)
            {
                *((char *)&v1 + node) = 0;
                if (v8)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/property/property_parse.c", 88, "parse_name");
                    v0 = *a1;
                    sub_a36abc(55, 100, "HERE-->%s");
                    if (*(long long *)&g_10002b0 == v2)
                        return 0;
                    ___stack_chk_fail();
                }
                else
                {
                    v11 = iter - 2;
                    do
                    {
                        v12 = v11;
                        v13 = v12 + 1;
                        v11 = v13;
                    } while (sub_a6994c(v12[1], 8));
                    *a1 = v13;
                    *a2 = sub_aa7b04(a0, &v1, v6);
                    if (*(long long *)&g_10002b0 == v2)
                        return 1;
                    ___stack_chk_fail();
                }
            }
            if (node <= 98)
            {
                *((char *)&v1 + node) = 46;
                node += 1;
            }
            else
            {
                v8 = 1;
            }
            v6 = 1;
        } while (sub_a6994c(*iter, 3));
    }
    sub_a368c8();
    sub_a369bc("crypto/property/property_parse.c", 67, "parse_name");
    v0 = *a1;
    sub_a36abc(55, 103, "HERE-->%s");
    if (*(long long *)&g_10002b0 == v2)
        return 0;
    ___stack_chk_fail();
}
