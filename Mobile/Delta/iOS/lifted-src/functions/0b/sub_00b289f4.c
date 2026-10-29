/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb289f4..0xb28bac (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b289f4_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[4];
    unsigned int field_1c;
    long long field_20;
    long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
} st_b289f4_0;


unsigned long long sub_b289f4(st_b289f4_0 *a0, unsigned long long a1, long long *a2, long long a3)
{
    unsigned long long v3;  // x0
    long long v4;  // x1
    unsigned long long v6;  // x0
    long long v7;  // x22
    unsigned long long v8;  // x19
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a2f9e0();
    if (!(unsigned int)v3)
        return v3;
    if (a0->field_1c != 1)
    {
        if (!a0->field_1c)
            return sub_b292ac();
    }
    else
    {
        if (a1)
        {
            if ((unsigned long long)a0->field_38 > (unsigned long long)a3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/exchange/dh_exch.c", 228, "dh_X9_42_kdf_derive");
                v4 = 106;
            }
            else
            {
                if (a0->field_8 && a0->field_10)
                {
                    v0 = sub_9ffc34();
                    v6 = sub_a6c610(v0, "providers/implementations/exchange/dh_exch.c", 233);
                    if (!v6)
                        return v6;
                    v7 = v6;
                    if (sub_b292ac(a0, v7, &v0, v0, 1) && (a0->field_1c != 1 || sub_9fec1c(a1, a0->field_38, v7, v0, a0->field_40, a0->field_28, a0->field_30, a0->field_20, a0->field_0, 0)))
                    {
                        *a2 = a0->field_38;
                        v8 = 1;
                    }
                    else
                    {
                        v8 = 0;
                    }
                    sub_a6d4c0(v7, v0, "providers/implementations/exchange/dh_exch.c", 252);
                    return v8;
                }
                sub_a368c8(a0->field_8);
                sub_a369bc("providers/implementations/exchange/dh_exch.c", 188, "dh_plain_derive");
                v4 = 128;
            }
            sub_a36abc(57, v4, 0);
        }
        else
        {
            *a2 = a0->field_38;
            return 1;
        }
    }
    return 0;
}
