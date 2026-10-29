/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c3060..0x9c321c (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c3060_0 {
    char padding_0[20];
    unsigned int field_14;
    struct st_9c3060_0 *field_18;
} st_9c3060_0;

extern char g_10002b0;

unsigned long long sub_9c3060(long long a0, st_9c3060_0 *a1)
{
    unsigned long long v4;  // x19
    st_9c3060_0 *v5;  // x0
    st_9c3060_0 *v6;  // x23
    char v0;  // [bp-0x98]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (a1 && a1->field_18)
    {
        v4 = sub_a99b48(&v0, 80, a1, 0);
        if ((int)v4 >= 80)
        {
            if ((unsigned int)v4 == 0x7fffffff)
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/a_object.c", 191, "i2a_ASN1_OBJECT");
                sub_a36abc(13, 231, 0);
LABEL_9c31a8:
                v4 = 0xffffffff;
            }
            else
            {
                v5 = sub_a6bf4c((unsigned int)v4 + 1, "crypto/asn1/a_object.c", 194);
                if (!v5)
                    goto LABEL_9c31a8;
                v6 = v5;
                sub_a99b48();
                sub_9d3fec(a0, v6, v4);
                sub_a6c2e4(v6, "crypto/asn1/a_object.c", 206);
            }
        }
        else
        {
            if ((int)v4 >= 1)
            {
                sub_9d3fec(a0, &v0, v4);
            }
            else
            {
                v4 = sub_9d3fec(a0, "<INVALID>", 9);
                if ((int)v4 >= 1)
                    v4 += sub_9d3928(a0, a1->field_18, a1->field_14);
            }
        }
        if (*(long long *)&g_10002b0 == v1)
            return v4;
    }
    else if (*(long long *)&g_10002b0 == v1)
    {
        return sub_9d3fec();
    }
    ___stack_chk_fail();
}
