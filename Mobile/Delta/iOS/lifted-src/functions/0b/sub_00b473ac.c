/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb473ac..0xb4749c (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b473ac_1 {
    unsigned long long field_0;
    char padding_8[232];
    struct st_b473ac_0 *field_f0;
} st_b473ac_1;

typedef struct st_b473ac_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_b473ac_0;


unsigned long long sub_b473ac(st_b473ac_1 *a0, long long a1)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_b46ff0();
    if (!(unsigned int)v3)
    {
        return v3;
    }
    else if (v0)
    {
        return 1;
    }
    else
    {
        if (a0->field_0)
        {
            v4 = sub_a7c17c(a0->field_0);
            if (!(unsigned int)v4)
                return v4;
        }
        if (!sub_a6fbc4(a1, "use_derivation_function") || !(v5 = sub_a6fe3c(), !(unsigned int)v5))
        {
            v6 = sub_a6fbc4(a1, "cipher");
            if (v6)
            {
                if (!a0->field_f0->field_20)
                {
                    if (a0->field_0)
                    {
                        sub_a7c1b4(a0->field_0);
                        return 0;
                    }
                    return 0;
                }
                v5 = sub_a71468(v6, sub_a509dc(a0->field_f0->field_20));
                if ((unsigned int)v5)
                    goto LABEL_b47454;
            }
            else
            {
LABEL_b47454:
                v5 = sub_b46e6c(a0, a1);
            }
        }
        if (!a0->field_0)
            return v5;
        sub_a7c1b4(a0->field_0);
        return v5;
    }
}
