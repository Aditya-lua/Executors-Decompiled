/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3ccb4..0xc3cdc8 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3ccb4_0 {
    char padding_0[40];
    unsigned int field_28;
} st_c3ccb4_0;

extern long long g_e0eb40;

unsigned long long sub_c3ccb4(st_c3ccb4_0 *a0, unsigned long long a1)
{
    unsigned long long v4;  // x19
    unsigned long v5;  // x8
    unsigned long v6;  // x22
    unsigned long long v7;  // x0
    unsigned int v0;  // [bp-0x3c]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *(long long *)&a0->padding_0[32];
    if (!v4)
    {
        return 0;
    }
    else if (sub_be7850(v4, "'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 1) & 1)
    {
        return 1;
    }
    else if (a1)
    {
        v5 = a0->field_28;
        v6 = v5 - a1;
        if (a1 <= v5)
        {
            if (26 > v6)
            {
                v0 = (unsigned int)v6 + 97;
                v7 = sub_bee42c(&v0, v4);
            }
            else
            {
                if (sub_be7850(v4, "_false{ {  } = 0x", 1) & 1)
                    return 1;
                v1 = v6;
                v7 = sub_bef1c8(&v1, v4);
            }
            return v7;
        }
        else if (sub_be7850(v4, &g_e0eb40, 16) & 1)
        {
            return 1;
        }
        else
        {
            *(unsigned long long *)&a0->padding_0[0] = 0;
            a0->padding_0[8] = 0;
            return 0;
        }
    }
    else
    {
        return sub_be7850();
    }
}
