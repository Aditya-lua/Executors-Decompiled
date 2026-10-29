/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f65d0..0x9f6708 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f65d0_1 {
    char field_0;
    char field_1;
    unsigned short field_2;
} st_9f65d0_1;

typedef struct st_9f65d0_0 {
    long long field_0;
    char padding_8[56];
    char field_40;
    char field_41;
} st_9f65d0_0;


unsigned int sub_9f65d0(st_9f65d0_0 *a0, st_9f65d0_1 **a1, unsigned long a2)
{
    long long v2;  // x1
    long long v3;  // x1
    st_9f65d0_1 *v4;  // x21
    unsigned long v5;  // x8
    long long v6;  // x19
    unsigned long v7;  // x21
    unsigned long long v8;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a0->field_0)
    {
        sub_a368c8();
        sub_a369bc("crypto/ct/ct_oct.c", 31, "o2i_SCT_signature");
        v2 = 103;
        goto LABEL_9f66c0;
    }
    if (4 >= a2)
    {
        sub_a368c8();
        v3 = 42;
    }
    else
    {
        v4 = *a1;
        a0->field_40 = v4->field_0;
        a0->field_41 = v4->field_1;
        if (sub_9f7814())
        {
            v5 = v4->field_2;
            v6 = (unsigned int)((v5 & 0xff00) >> 8) | (unsigned int)v5 * 0x100 & 0xff00ff00;
            v7 = v4 + 1;
            v8 = &(&*a1->field_0)[-1 * v7];
            if ((unsigned long long)v6 > v8 + a2)
            {
                sub_a368c8();
                v3 = 58;
            }
            else
            {
                if (sub_9f7794(a0, v7, v6) == 1)
                {
                    *a1 = v7 + v6;
                    return v6 - v8;
                }
LABEL_9f66c8:
                return 0xffffffff;
            }
        }
        else
        {
            sub_a368c8();
            v3 = 0x33;
        }
    }
    sub_a369bc("crypto/ct/ct_oct.c", v3, "o2i_SCT_signature");
    v2 = 107;
LABEL_9f66c0:
    sub_a36abc(50, v2, 0);
    goto LABEL_9f66c8;
}
