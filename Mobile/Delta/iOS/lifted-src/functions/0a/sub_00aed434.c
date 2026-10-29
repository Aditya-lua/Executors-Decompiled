/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaed434..0xaed518 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_eb8b30;

long long sub_aed434(unsigned long a0, unsigned long a1, long long a2)
{
    unsigned long v3;  // x20
    long long *v4;  // x0
    unsigned long v5;  // x0
    unsigned long v6;  // x21
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if ((int)sub_ad69e4(a2) < 1)
        return 0;
    v3 = 0;
    while (1)
    {
        v4 = sub_ad69f8(a2, v3);
        v5 = sub_aef470(0, v4[1]);
        if (v5)
        {
            v6 = v5;
            if (sub_aed65c(&v0, v6, v4[2], 0xffffffff))
            {
                v3 = (unsigned int)v3 + 1;
                if ((int)v3 >= (int)sub_ad69e4(a2))
                    return v0;
            }
            else
            {
                sub_9cf124(v6);
                break;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_sxnet.c", 125, "SXNET_add_id_asc");
            sub_a36abc(0x22, 131, 0);
            break;
        }
    }
    sub_9cd960(v0, &g_eb8b30);
    return 0;
}
