/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d26c..0xb3d33c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3d26c_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_b3d26c_0;


unsigned long long sub_b3d26c(st_b3d26c_0 *a0, st_b3d26c_0 *a1, unsigned long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x21
    unsigned long long v5;  // x8
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    if (!(a2 & 1))
        return 1;
    v3 = *(long long *)&a0->padding_0[16];
    if (!v3 && !*(long long *)&a1->padding_0[16] && a0->field_18 == a1->field_18)
    {
        v5 = *(long long *)&a1[1].padding_0[0];
        if (*(long long *)&a0[1].padding_0[0])
        {
            if (v5)
            {
                if (!v3)
                    return sub_a4fe08(*(long long *)&a0[1].padding_0[0], sub_a509dc(v5)) != 0;
                goto LABEL_b3d324;
            }
        }
        else
        {
            if (!v5)
            {
                if (!v3)
                    return 1;
LABEL_b3d324:
                v6 = !sub_a66f20();
                v4 = *(long long *)&a0[1].padding_0[0];
                if (!*(long long *)&a0[1].padding_0[0])
                    return v6;
LABEL_b3d2ec:
                if (!(unsigned int)v6)
                    return v6;
                return sub_a4fe08(v4, sub_a509dc(*(long long *)&a1[1].padding_0[0])) != 0;
            }
        }
    }
    v6 = 0;
    v4 = *(long long *)&a0[1].padding_0[0];
    if (!*(long long *)&a0[1].padding_0[0])
        return 0;
    goto LABEL_b3d2ec;
}
