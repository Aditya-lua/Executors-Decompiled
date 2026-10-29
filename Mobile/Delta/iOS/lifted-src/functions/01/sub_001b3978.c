/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b3978..0x1b3d98 (1056 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b3978_4 {
    char padding_0[24];
    struct st_1b3978_5 *field_18;
    struct st_1b3978_5 *field_20;
    char padding_28[48];
    char field_58;
    char padding_59[80];
    char field_a9;
    char field_aa;
} st_1b3978_4;

typedef struct st_1b3978_1 {
    char padding_0[40];
    struct st_1b3978_2 *field_28;
} st_1b3978_1;

typedef struct st_1b3978_2 {
    unsigned long long field_0;
} st_1b3978_2;

typedef struct st_1b3978_5 {
    struct st_1b3978_1 *field_0;
} st_1b3978_5;

typedef struct st_1b3978_0 {
    char field_0;
} st_1b3978_0;


char * sub_1b3978(st_1b3978_4 *a0, long long a1, long long a2)
{
    unsigned long long v7;  // x0
    char i;  // x22
    long long v17;  // x0
    long long v18;  // x0
    char *v9;  // x0
    char *v10;  // x0
    char j;  // x22
    char *v12;  // x0
    char *v13;  // x0
    long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    st_1b3978_0 **v0;  // [bp-0xc8], Other Possible Types: char
    st_1b3978_0 *v1;  // [bp-0xc0]
    char v2;  // [bp-0x88]
    char v3;  // [bp-0x70]
    char v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_aa == 1)
    {
        v7 = sub_6b08(a1);
        if (!(a0->field_a9 & 1))
        {
            if (v7)
            {
                i = 0;
                do
                {
                    v9 = sub_9c78(a1, i);
                    v10 = sub_9c78(a1, i);
                    *v10 = *v9;
                    i += 1;
                } while (i < sub_6b08(a1));
            }
            if (sub_6b08(a2))
            {
                j = 0;
                do
                {
                    v12 = sub_9c78(a2, j);
                    v13 = sub_9c78(a2, j);
                    *v13 = *v12;
                    j += 1;
                } while (j < sub_6b08(a2));
            }
        }
        else if (v7)
        {
            sub_9c78(a1, 0);
            (*(long long *)(*(long long *)a0->field_18 + 40))();
        }
        else if (sub_6b08(a2))
        {
            sub_9c78(a2, 0);
            (*(long long *)(*(long long *)a0->field_18 + 40))();
        }
        v14 = sub_a0c8(a1);
        v15 = sub_a0c8(a1);
        v16 = sub_6b08(a1);
        sub_181f0(&v4, v14, v15 + v16, v15 + v16 - v14);
        sub_a0c8(&v4);
        sub_a0c8(&v4);
        sub_6b08(&v4);
        (*(long long *)(*(long long *)a0->field_20 + 32))();
    }
    else
    {
        if (sub_6b08(a1) == 1 && sub_6b08(a2) == 1)
        {
            if (a0->field_a9 == 1)
            {
                sub_9c78(a1, 0);
                (*(long long *)(*(long long *)a0->field_18 + 40))();
            }
            sub_5c38(&v2, a1);
            sub_5c38(&v3, a2);
            sub_1c65d4(&a0->field_58, &v2);
            return &v2;
        }
        v17 = __Unwind_Resume(sub_1bfa98());
        v18 = __Unwind_Resume(__Unwind_Resume(v17));
        __Unwind_Resume(v18);
    }
}
