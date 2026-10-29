/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc54250..0xc54460 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c54250_0 {
    long long field_0;
    struct st_c54250_1 *field_8;
} st_c54250_0;

typedef struct st_c54250_1 {
    struct st_c54250_1 *field_0;
    struct st_c54250_1 *field_8;
    struct st_c54250_1 *field_10;
    unsigned long long field_18;
    struct st_c54250_1 *field_20;
} st_c54250_1;

typedef struct st_c54250_2 {
    char padding_0[96];
    unsigned long long field_60;
    char padding_68[80];
    char *field_b8;
    long long field_c0;
    char padding_c8[8];
    struct st_c54250_1 *field_d0;
    long long field_d8;
    char padding_e0[8];
    struct st_c54250_1 *field_e8;
    long long field_f0;
    char padding_f8[8];
    struct st_c54250_1 *field_100;
    long long field_108;
    char padding_110[96];
    long long field_170;
    char padding_178[80];
    struct st_c54250_1 *field_1c8;
    struct st_c54250_1 *field_1d0;
    struct st_c54250_1 *field_1d8;
    struct st_c54250_0 *field_1e0;
    struct st_c54250_1 *field_1e8;
    struct st_c54250_1 *field_1f0;
    struct st_c54250_1 *field_1f8;
    struct st_c54250_1 *field_200;
    long long field_208;
    struct st_c54250_1 *field_210;
    char field_218;
} st_c54250_2;


long long sub_c54250(st_c54250_2 *a0)
{
    unsigned long long v2;  // 4102
    char *v3;  // x20
    char **v12;  // x22
    char *v13;  // x21
    unsigned long v14;  // x0
    char *v4;  // x21
    char **v5;  // x22
    char *v6;  // x21
    char *v7;  // x21
    char **v8;  // x22
    char *v9;  // x21
    char *v10;  // x20
    char *v11;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v2 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (!(v2 & 1))
    {
        /* unsupported instruction */;
        sub_c53420(a0->field_170);
    }
    if (a0->field_60 != 47)
    {
        if (a0->field_b8)
            _free(a0->field_c0);
        if (a0->field_d0)
            _free(a0->field_d8);
        if (a0->field_e8)
            _free(a0->field_f0);
        if (a0->field_100)
            _free(a0->field_108);
    }
    if (a0->field_1c8)
    {
        v3 = a0->field_1d0;
        if (v3)
        {
            v4 = a0->field_1d8;
            if (a0->field_1d8)
            {
                v5 = v3 + 8;
                do
                {
                    v6 = v4;
                    if (*(long long *)((char *)v5 - 8))
                        _free(*v5);
                } while ((v5 += 3, v4 = v6 - 1, v6 != 1));
                _free(v3);
            }
            v7 = a0->field_1e8;
            if (a0->field_1e8)
            {
                v8 = &a0->field_1e0->field_8;
                do
                {
                    v9 = v7;
                    if (*v8)
                        _free(*(long long *)((char *)v8 - 8));
                } while ((v8 += 4, v7 = v9 - 1, v9 != 1));
                _free(a0->field_1e0);
            }
        }
    }
    if (a0->field_1f0)
    {
        v10 = a0->field_1f8;
        if (v10)
        {
            v11 = a0->field_200;
            if (a0->field_200)
            {
                v12 = v10 + 16;
                do
                {
                    v13 = v11;
                    if (*(long long *)((char *)v12 - 16) && *(long long *)((char *)v12 - 8))
                    {
                        if (*v12)
                            _free();
                        if (v12[2])
                            _free(v12[1]);
                    }
                } while ((v12 += 9, v11 = v13 - 1, v13 != 1));
                _free(v10);
            }
            if (a0->field_210)
                _free(a0->field_208);
        }
    }
    v14 = a0->field_218;
    if ((unsigned int)v14 != 83)
        return sub_c5326c();
    return v14;
}
