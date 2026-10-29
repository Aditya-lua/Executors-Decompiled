/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c9c30..0x9c9e18 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e8a348;

unsigned long long sub_9c9c30(long long a0, long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, long long a5)
{
    unsigned long long v3;  // x19
    unsigned long long v4;  // x24
    unsigned long long v5;  // x0
    long long v6;  // x1
    unsigned long long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_9cde20(&g_e8a348);
    if (!v3)
    {
        sub_a368c8();
        v6 = 39;
    }
    else if (sub_9c19dc())
    {
        if (!a4)
            v4 = 8;
        else
            v4 = a4;
        if (v4 >> 31 & 1)
            goto LABEL_9c9d20;
        v5 = sub_a6bf4c(v4, "crypto/asn1/p5_pbe.c", 53);
        if (!v5)
            goto LABEL_9c9d24;
        if (a3)
        {
            _memcpy();
            goto LABEL_9c9d8c;
        }
        v5 = v5;
        if ((int)sub_aa8658(a5, v5, v4, 0) < 1)
        {
LABEL_9c9d24:
            sub_a6c2e4(v5, "crypto/asn1/p5_pbe.c", 76);
            sub_9cd960(v3, &g_e8a348);
            sub_9c7940(v0);
            return 0;
        }
LABEL_9c9d8c:
        sub_9c79a0(*(long long *)v3, v5, v4);
        if (sub_9c8d24(v3, &g_e8a348, &v0))
        {
            sub_9cd960(v3, &g_e8a348);
            if (sub_9cf6d4(a0, sub_a99624(a1), 16, v0))
                return 1;
            v3 = 0;
LABEL_9c9d20:
            v5 = 0;
            goto LABEL_9c9d24;
        }
        else
        {
            sub_a368c8();
            v6 = 65;
        }
    }
    else
    {
        sub_a368c8();
        v6 = 45;
    }
    sub_a369bc("crypto/asn1/p5_pbe.c", v6, "PKCS5_pbe_set0_algor_ex");
    sub_a36abc(13, 0x8000d, 0);
    goto LABEL_9c9d20;
}
