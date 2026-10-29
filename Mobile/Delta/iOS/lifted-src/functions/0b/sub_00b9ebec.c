/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9ebec..0xb9ecac (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9ebec_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_b9ebec_0;

typedef struct st_b9ebec_1 {
    char *field_0;
    struct st_b9ebec_0 *field_8;
    struct st_b9ebec_0 *field_10;
} st_b9ebec_1;


st_b9ebec_1 * sub_b9ebec(st_b9ebec_1 *a0, st_b9ebec_0 *a1, char *a2)
{
    char *v3;  // x19
    char *ptr;  // x0
    char *v5;  // x8
    char *v6;  // x2
    st_b9ebec_0 *v7;  // x11
    unsigned long long *iter;  // x9
    char *i;  // x10
    unsigned long v10;  // x13
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v3 = a2 * 16;
    if (a2 > 0xfffffffffffffff)
        sub_c6b970(0, v3);
    if (0x7ffffffffffffff8 >= v3)
    {
        if (v3)
        {
            ptr = _malloc(v3);
            if (!ptr)
                sub_c6b970(8, v3);
            v5 = ptr;
            v6 = a2;
            if (a2)
            {
                v7 = a1;
                iter = v5 + 8;
                i = v6;
                do
                {
                    if (!v3)
                        break;
                    v10 = v7->field_8;
                    *(unsigned int *)((char *)iter - 8) = v7->field_0;
                    *iter = v10;
                    iter += 2;
                    v3 -= 16;
                    i -= 1;
                    v7 += 1;
                } while (i);
            }
            a2 = v6;
        }
        else
        {
            v6 = 0;
            v5 = 8;
        }
        a0->field_0 = v6;
        a0->field_8 = v5;
        a0->field_10 = a2;
        return a0;
    }
    sub_c6b970(0, v3);
}
