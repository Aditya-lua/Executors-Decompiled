/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa197c4..0xa198c4 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a197c4_0 {
    struct st_a197c4_0 *field_0;
    char padding_8[312];
    struct st_a197c4_0 *field_140;
} st_a197c4_0;

typedef struct st_a197c4_1 {
    char padding_0[48];
    struct st_a197c4_0 *field_30;
} st_a197c4_1;

typedef struct st_a197c4_2 {
    struct st_a197c4_1 *field_0;
    char padding_8[16];
    struct st_a197c4_0 *field_18;
    char padding_20[8];
    struct st_a197c4_0 *field_28;
    char padding_30[48];
    unsigned long long field_60;
} st_a197c4_2;


st_a197c4_0 * sub_a197c4(st_a197c4_2 *a0, st_a197c4_0 *a1)
{
    st_a197c4_0 *v2;  // x0
    st_a197c4_0 *v3;  // x0
    st_a197c4_0 *v4;  // x0
    st_a197c4_0 *v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    if (!v2)
        return v2;
    if (!v2->field_0)
        return 0;
    v3 = sub_c4ba8();
    if (!v3)
    {
        return v3;
    }
    else if (!sub_9e4828())
    {
        if (a0->field_18->field_0->field_140)
        {
            a0->field_18->field_0->field_140();
        }
        else if (a0->field_0->field_30)
        {
            a0->field_0->field_30();
        }
        else if (a1)
        {
            v4 = sub_9e4b00(a1);
            if (!v4)
                return v4;
            v5 = v4;
            sub_9e5d14();
            if (sub_9e4cdc(v5, sub_9e4290(v3) + 2))
            {
                sub_9e4838(a0->field_28);
                a0->field_28 = v5;
                a0->field_60 = a0->field_60 + 1;
                return 1;
            }
            sub_9e4838(v5);
        }
        else
        {
            sub_9e4838(a0->field_28);
            a0->field_28 = 0;
            return 0;
        }
    }
    return 0;
}
