/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3cdc8..0xc3cf30 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3cdc8_0 {
    unsigned long long field_0;
    char field_8;
} st_c3cdc8_0;

extern long long g_efcb90;

unsigned long long sub_c3cdc8(st_c3cdc8_0 *a0, long long a1)
{
    unsigned long long v4;  // x20
    unsigned long long v5;  // w19
    unsigned long v6;  // cc_dep1
    unsigned long long v7;  // 4107
    unsigned long long v8;  // 4107
    unsigned long v0;  // [bp-0x40], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0->field_0)
    {
        sub_c3d01c(&v0, a0);
        if (v0)
        {
            if (sub_c3d0c8(v0, v1) == 1)
            {
                v0 = v1;
                v4 = *(long long *)((char *)&a0[3].field_0 + 5);
                if (!v4)
                    return 0;
                if (!(sub_bef1c8(&v0, v4) & 1))
                    goto LABEL_c3cee4;
            }
            else
            {
                v4 = *(long long *)((char *)&a0[3].field_0 + 5);
                if (!v4)
                    return 0;
                if (sub_be7850(v4, "0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2) & 1)
                    return 1;
                if (!(sub_be7850(v4, v0, v1) & 1))
                {
LABEL_c3cee4:
                    if (*(char *)(v4 + 18) < 0)
                        return 0;
                    if (sub_c3dfd0(a1))
                        return sub_be7850();
                    sub_c73c64(&g_efcb90);
                }
            }
        }
        else
        {
            v5 = (char)v1;
            if (!*(long long *)((char *)&a0[3].field_0 + 5))
            {
                a0->field_0 = 0;
                a0->field_8 = v5;
                return 0;
            }
            v6 = v5 & 0xff;
            if (v5)
            {
                v7 = arm64g_calculate_condition(19, v6, 0, 0);
                if (!(v7 & 1))
                    goto LABEL_c3ce8e;
LABEL_c3ce8d:
            }
            else
            {
                v8 = arm64g_calculate_condition(19, v6, 0, 0);
                if (v8 & 1)
                    goto LABEL_c3ce8d;
LABEL_c3ce8e:
            }
            if (!(sub_be7850() & 1))
            {
                a0->field_0 = 0;
                a0->field_8 = v5;
                return 0;
            }
        }
        return 1;
    }
    else if (*(long long *)((char *)&a0[3].field_0 + 5))
    {
        return sub_be7850();
    }
    else
    {
        return *(long long *)((char *)&a0[3].field_0 + 5);
    }
}
