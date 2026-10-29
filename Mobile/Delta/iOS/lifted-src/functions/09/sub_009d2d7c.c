/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d2d7c..0x9d2e90 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d2d7c_0 {
    struct st_9d2d7c_0 *field_0;
    unsigned int field_8;
    int field_c;
} st_9d2d7c_0;


st_9d2d7c_0 * sub_9d2d7c(st_9d2d7c_0 *a0, unsigned int a1, st_9d2d7c_0 *a2, st_9d2d7c_0 *a3)
{
    st_9d2d7c_0 *v2;  // x0
    st_9d2d7c_0 *v3;  // x20
    st_9d2d7c_0 *v4;  // x0
    st_9d2d7c_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0xffffffffffffffff;
    v2 = sub_975ffc();
    if (v2)
    {
        switch (a1)
        {
        case 80:
            if (a2 >= 0)
            {
                v2->field_8 = (unsigned int)a2;
                break;
            }
            else
            {
                return 0;
            }
        case 1: case 128:
            v2->field_c = 1;
            goto LABEL_9d2e38;
        case 81:
            return v2->field_8;
        case 79:
            v3 = v2;
            sub_a6c2e4(v2->field_0, "crypto/bio/bf_prefix.c", 161);
            if (a3)
            {
                v4 = sub_a6d9b4(a3, "crypto/bio/bf_prefix.c", 166);
                v3->field_0 = v4;
                return v4 != 0;
            }
            v3->field_0 = 0;
            break;
        default:
LABEL_9d2e38:
            v5 = sub_9d500c(a0);
            if (!v5)
                return v5;
            sub_9d500c(a0);
        }
        return 1;
    }
    return 0xffffffffffffffff;
}
