/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbebec0..0xbec090 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bebec0_0 {
    struct st_bebec0_1 *field_0;
    struct st_bebec0_1 *field_8;
    unsigned short field_10;
} st_bebec0_0;

typedef struct st_bebec0_1 {
    char field_0;
} st_bebec0_1;

extern void g_efac08;

st_bebec0_0 * sub_bebec0(st_bebec0_0 *a0, void* a1, void* a2, void* a3, unsigned int a4, short a5, unsigned long a6, unsigned long a7)
{
    void* v2;  // x3
    void* v3;  // x10
    void* v4;  // x10
    char *v5;  // x8
    void* v6;  // x19
    unsigned int v7;  // w8
    void* v8;  // x1
    char v9;  // x20
    char *v0;  // [bp-0x10]
    unsigned long v1;  // [bp+0x0]

    v0 = &v1;
    if (a7 <= v1)
    {
        a0->field_0 = 0;
        return a0;
    }
    else if (a7 - v1 > v1)
    {
        if (a7 - a6 <= a6 || v1 * 2 > a7 - a6 * 2)
        {
            if (a6 <= v1)
            {
                a0->field_0 = 0;
                return a0;
            }
            if (a7 - (a6 - v1) > a6 - v1)
            {
                a0->field_0 = 0;
                return a0;
            }
            v2 = a3;
            if (a2 < v2)
                goto LABEL_bec068;
            v3 = a3;
            do
            {
                v4 = v3;
                if (!v4)
                {
                    v9 = 49;
                    if (a3)
                    {
                        v6 = a1;
                        *(char *)a1 = 49;
                        v9 = 48;
                        _memset(a1 + 1, 48, a3 - 1);
                    }
                    else
                    {
                        v6 = a1;
                        a3 = 0;
                    }
                    v7 = (unsigned short)a4 + 1;
                    if ((int)v7 > a5)
                    {
                        v8 = a3;
                        if (a2 > a3)
                        {
                            *(char *)(v6 + v8) = v9;
                            v8 += 1;
                            goto LABEL_bec03c;
                        }
                    }
                    else
                    {
                        v8 = a3;
                        goto LABEL_bec03c;
                    }
                }
            } while ((v5 = a1 + v4, v3 = v4 - 1, *(v5 - 1) == 57));
            *(char *)(a1 + v3) = *(char *)(a1 + v3) + 1;
            v6 = a1;
            _memset(v5, 48, a3 - v4);
            v7 = a4;
            v8 = a3;
LABEL_bec03c:
            if (a2 >= v8)
            {
                a0->field_0 = v6;
                a0->field_8 = v8;
                a0->field_10 = v7;
                return a0;
            }
        }
        else
        {
            if (a2 >= a3)
            {
                a0->field_0 = a1;
                a0->field_8 = a3;
                a0->field_10 = a4;
                return a0;
            }
            v2 = &g_efac08;
            sub_c73bb0(0, a3);
LABEL_bec068:
            sub_c73bb0(0, v2);
        }
        sub_c73bb0(0);
    }
    else
    {
        a0->field_0 = 0;
        return a0;
    }
}
