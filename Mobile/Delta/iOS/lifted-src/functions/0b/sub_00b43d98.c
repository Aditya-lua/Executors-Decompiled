/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43d98..0xb43f60 (456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43d98_0 {
    long long field_0;
    void* field_8;
} st_b43d98_0;


void* sub_b43d98(st_b43d98_0 *a0, void* a1)
{
    void* v2;  // x19
    long long v3;  // x0
    void* v12;  // x0
    void* v4;  // x0
    long long v5;  // x0
    void* v6;  // x0
    long long v7;  // x1
    void* v8;  // x0
    unsigned int v9;  // w0
    void* v10;  // x0
    void* v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    v3 = sub_9f2aec(a0->field_0);
    if (!a1)
    {
        return 1;
    }
    else if (*(long long *)a1)
    {
        if (!v2)
            return 0;
        if (sub_a6fbc4(a1, "cipher"))
        {
            v4 = sub_afde7c(a0 + 1, a1, v3);
            if (!(unsigned int)v4)
                return v4;
            if (sub_a4fdf4(sub_954340(a0 + 1)) == 6)
            {
                v5 = sub_954340(a0 + 1);
                v6 = sub_a4d02c(v2, v5, sub_c4ba8(a0 + 1), 0, 0);
                if (!(unsigned int)v6)
                    return v6;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/macs/gmac_prov.c", 220, "gmac_set_ctx_params");
                v7 = 125;
                goto LABEL_b43f40;
            }
        }
        v8 = sub_a6fbc4(a1, "key");
        if (!v8)
        {
LABEL_b43e90:
            v11 = sub_a6fbc4(a1, "iv");
            if (!v11)
                return 1;
            if ((int)v11[8] == 5)
            {
                if ((int)sub_a4d5dc(v2, 9, (int)v11[24], 0) >= 1)
                {
                    v12 = sub_a4d02c(v2, 0, 0, 0, (long long)v11[16]);
                    if (!(unsigned int)v12)
                        return v12;
                    return 1;
                }
            }
            else
            {
                return 0;
            }
        }
        else if ((int)v8[8] == 5)
        {
            v9 = sub_a50904(a0->field_8);
            if ((long long)v8[24] == v9)
            {
                v10 = sub_a4d02c(a0->field_8, 0, 0, (long long)v8[16], 0);
                if (!(unsigned int)v10)
                    return v10;
                goto LABEL_b43e90;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/macs/gmac_prov.c", 106, "gmac_setkey");
                v7 = 105;
LABEL_b43f40:
                sub_a36abc(57, v7, 0);
            }
        }
        return 0;
    }
    else
    {
        return 1;
    }
}
