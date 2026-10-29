/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadd5a8..0xadd704 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_add5a8(long long a0, void* a1, unsigned long long a2, unsigned int a3)
{
    long long v4;  // x24
    unsigned long long v5;  // x0
    unsigned long long v6;  // x19
    unsigned long long v7;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x26
    unsigned long v0;  // [bp-0x68]
    uint128_t v1;  // [bp-0x60]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_9ffdd0();
    v5 = sub_ad6b74(*(long long *)a1, (long long)a1[8], (long long)a1[16], 0, 0, 0, 0, 0);
    if (!v5)
        return 0;
    v6 = v5;
    if (a2)
        sub_ad7068(v6, a2);
    v7 = sub_ad733c(v6);
    if (v7)
    {
        do
        {
            switch ((unsigned int)sub_9c7b68(v7))
            {
            case 6:
                v9 = sub_af311c(v4, sub_ad7a60(v7));
            case 5:
                v9 = sub_af2f6c(v4, sub_ad7a44(v7));
                continue;
            case 1:
                if ((int)a3 >= 1)
                {
                    v0 = sub_ad7a28(v7);
                    v1 = (int128_t)a1[8];
                    v9 = sub_add5a8(a0, &v0, a2, 0);
                    continue;
                }
            default:
                sub_ad753c(v7);
                goto LABEL_add6d8;
            }
        } while ((v10 = v9, sub_ad753c(v7), (unsigned int)v10 && (v7 = sub_ad733c(v6), v7)));
    }
    else
    {
LABEL_add6d8:
        v10 = 0;
    }
    sub_ad763c(v6);
    return v10;
}
