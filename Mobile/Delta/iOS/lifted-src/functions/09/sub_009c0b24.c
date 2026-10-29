/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c0b24..0x9c0c38 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c0b24(long long a0, unsigned long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    unsigned long long v3;  // x19
    unsigned long long v4;  // x0
    unsigned long long v5;  // x25
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1;
    v0 = 0;
    v4 = sub_9ccc7c(a2, &v0, a0);
    if (v4 >> 31 & 1)
    {
        return 0;
    }
    else if (v0)
    {
        v5 = v3;
        if (sub_9ffde0(v5))
        {
LABEL_9c0ba8:
            if (!v5)
                goto LABEL_9c0bf0;
LABEL_9c0bac:
            v6 = sub_a40abc(v0, v4 & 0xffffffff, a3, a4, v5, 0);
        }
        else if (sub_a351bc(sub_9c7b68(v3)))
        {
            sub_a32e7c();
            v5 = v3;
            goto LABEL_9c0ba8;
        }
        else
        {
            v5 = sub_a40ca8(a5, sub_a50a58(v3), a6);
            if (v5)
                goto LABEL_9c0bac;
LABEL_9c0bf0:
            v6 = 0;
        }
        sub_a6c2e4(v0, "crypto/asn1/a_digest.c", 81);
        if (v5 == v3)
            return v6;
        sub_a3f52c(v5);
        return v6;
    }
    else
    {
        return 0;
    }
}
