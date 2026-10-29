/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa63c0..0xaa6a3c (1660 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_aa63c0(long long a0, char **a1, void* a2, long long a3)
{
    char *v7;  // x23
    long long v23;  // x2
    long long v26;  // x1
    unsigned int v9;  // w8
    unsigned long long v33;  // x0
    char *v37;  // x23
    unsigned long long v38;  // w8
    unsigned long long v39;  // w25
    unsigned long long v40;  // x24
    char *v41;  // x23
    unsigned long long v42;  // x25
    unsigned long long v43;  // w8
    unsigned long long v44;  // w0
    unsigned long long v45;  // x21
    char *v46;  // x22
    char *v47;  // x22
    char *v48;  // x22
    char *v0;  // [bp-0x470]
    char v3;  // [bp-0x450]
    unsigned long v4;  // [bp-0x68]

    if (sub_a69974((char)v9))
    {
        if (*(long long *)&g_10002b0 == v4)
            return sub_aa7728();
LABEL_aa6a38:
        ___stack_chk_fail();
    }
    else
    {
        v33 = sub_a6994c(*v7, 3);
        if ((unsigned int)v33 && !(v33 = 0, v37 = *a1, v38 = *v37, !v38 || v38 == 44))
        {
            if (sub_a6994c((char)v38, 0x100))
            {
                v39 = 0;
                v40 = 0;
                do
                {
                    v41 = v37;
                    v37 = v41;
                    if (sub_a6994c(*v37, 8) || !(v37 = v41, *v37 != 44))
                        break;
                    if (v40 <= 998)
                    {
                        (&v3)[v40] = sub_a69994();
                        v40 += 1;
                    }
                    else
                    {
                        v39 = 1;
                    }
                    v37 = v41 + 1;
                } while (sub_a6994c(v41[1], 0x100));
                v42 = !v39;
            }
            else
            {
                v40 = 0;
                v42 = 1;
            }
            if (sub_a6994c(*v37, 8) || (v43 = *v37, !*v37 || *v37 == 44))
            {
                (&v3)[v40] = 0;
                if (v42 & 1)
                {
                    v44 = (unsigned int)sub_aa7e04(a0, &v3, a3);
                    *(unsigned int *)&a2[16] = v44;
                    v45 = v44 != 0;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/property/property_parse.c", 248, "parse_unquoted");
                    v0 = *a1;
                    sub_a36abc(55, 109, "HERE-->%s");
                    v45 = 0;
                }
                v46 = v37 - 1;
                do
                {
                    v47 = v46;
                    v48 = v47 + 1;
                    v46 = v48;
                } while (sub_a6994c(v47[1], 8));
                *a1 = v48;
                *(unsigned int *)&a2[4] = 0;
                v33 = v45;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/property/property_parse.c", 242, "parse_unquoted");
                v0 = v37;
                v23 = "HERE-->%s";
                v26 = 101;
                sub_a36abc(55, v26, v23);
                v33 = 0;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return v33;
    goto LABEL_aa6a38;
}
