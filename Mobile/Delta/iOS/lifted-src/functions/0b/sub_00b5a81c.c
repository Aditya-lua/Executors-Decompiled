/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5a81c..0xb5a9dc (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5a81c_0 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
    unsigned long long field_18;
    long long field_20;
} st_b5a81c_0;


unsigned long long sub_b5a81c(st_b5a81c_0 *a0, long long a1, unsigned long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // w0
    long long v6;  // x1
    unsigned long long v7;  // x21
    unsigned long long v8;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_b5a9e8(a0, a3);
    if (!(unsigned int)v3)
        return v3;
    if (!a0->field_8)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/pvkkdf.c", 145, "kdf_pvk_derive");
        v6 = 130;
    }
    else if (a0->field_18)
    {
        v4 = sub_954340(a0 + 1);
        if (v4)
        {
            v5 = (unsigned int)sub_a50ac8();
            if (v5 <= 0)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/pvkkdf.c", 161, "kdf_pvk_derive");
                v6 = 142;
            }
            else if (v5 > a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/pvkkdf.c", 165, "kdf_pvk_derive");
                v6 = 202;
            }
            else
            {
                v7 = sub_a3f728();
                if (v7 && sub_a3fe04(v7, v4, 0) && sub_a3fe10(v7, a0->field_18, a0->field_20) && sub_a3fe10(v7, a0->field_8, a0->field_10))
                    v8 = sub_a3ff7c(v7, a1, 0) != 0;
                else
                    v8 = 0;
                sub_a3f73c(v7);
                return v8;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/pvkkdf.c", 156, "kdf_pvk_derive");
            v6 = 122;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/pvkkdf.c", 150, "kdf_pvk_derive");
        v6 = 131;
    }
    sub_a36abc(57, v6, 0);
    return 0;
}
