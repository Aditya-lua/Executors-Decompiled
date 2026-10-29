/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa5ba8..0xaa5e00 (600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa5ba8_0 {
    struct st_aa5ba8_0 *field_0;
    long long field_8;
    struct st_aa5ba8_0 *field_10;
    struct st_aa5ba8_1 *field_18;
    struct st_aa5ba8_0 *field_20;
    struct st_aa5ba8_0 *field_28;
} st_aa5ba8_0;

typedef struct st_aa5ba8_1 {
    unsigned long long field_0;
} st_aa5ba8_1;

extern long long g_aa5e54;
extern unsigned int g_f09058;

st_aa5ba8_0 * sub_aa5ba8(st_aa5ba8_0 *a0, st_aa5ba8_0 *a1, st_aa5ba8_0 *a2, st_aa5ba8_0 *a3, st_aa5ba8_0 *a4, unsigned long long *a5, st_aa5ba8_0 *a6)
{
    st_aa5ba8_0 *v6;  // x0
    st_aa5ba8_0 *v7;  // x0
    st_aa5ba8_0 *v8;  // x22
    st_aa5ba8_0 *v9;  // x0
    st_aa5ba8_0 *v10;  // x8
    st_aa5ba8_0 *v0;  // [bp-0x90], Other Possible Types: char
    st_aa5ba8_0 *v1;  // [bp-0x88]
    st_aa5ba8_0 *v2;  // [bp-0x80], Other Possible Types: unsigned int
    st_aa5ba8_0 *v3;  // [bp-0x7c]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (!a1)
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (a2 < 1)
    {
        return 0;
    }
    else if (a3)
    {
        v6 = sub_a7c198(a0->field_10);
        if (!(unsigned int)v6)
            return v6;
        if ((int)a0->field_28)
        {
            v1 = 0;
            v3 = (st_aa5ba8_0 *)0;
            v2 = (st_aa5ba8_0 *)(unsigned int)sub_a67068();
            if (!v2)
            {
                v3 = (st_aa5ba8_0 *)1;
                v2 = g_f09058;
            }
            *(unsigned int *)&a0->field_28 = 0;
            sub_a7b61c(a0->field_8, &g_aa5e54, &v0);
            a0->field_20 = v1;
            if (v3)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
            }
        }
        v7 = sub_a7b720(a0->field_8, a2);
        if (v7)
        {
            if (a4)
            {
                v8 = sub_a6bf4c(_strlen(a3) + 48, "crypto/property/property.c", 922);
                if (v8)
                {
                    v8->field_0 = a1;
                    v8->field_8 = &v8->field_28;
                    v8->field_10 = a4;
                    v8->field_18 = a5;
                    v8->field_20 = a6;
                    a5();
                }
LABEL_aa5d2c:
                sub_a6c2e4(v8, "crypto/property/property.c", 945);
                v10 = 0;
            }
            else
            {
                v0 = a1;
                v1 = a3;
                v9 = sub_a66994(v7->field_10, &v0);
                if (v9)
                    v9->field_20();
                v10 = 1;
            }
            sub_a7c1b4(a0->field_10);
            return v10;
        }
        v8 = 0;
        goto LABEL_aa5d2c;
    }
    else
    {
        return 0;
    }
}
