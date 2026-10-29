/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4aa7c..0xc4aef4 (1144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4aa7c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_c4aa7c_1;

typedef struct st_c4aa7c_2 {
    char padding_0[120];
    struct st_c4aa7c_3 *field_78;
    char padding_80[130];
    unsigned short field_102;
} st_c4aa7c_2;

typedef struct st_c4aa7c_0 {
    char padding_0[392];
    unsigned long long field_188;
} st_c4aa7c_0;

typedef struct st_c4aa7c_3 {
    unsigned long long field_0;
} st_c4aa7c_3;

extern char g_e06e66;
extern char g_e06e94;
extern char g_e06ec2;

void sub_c4aa7c(st_c4aa7c_1 *a0, unsigned long a1, st_c4aa7c_0 *a2, unsigned long long *a3, st_c4aa7c_2 *a4)
{
    unsigned long long v8;  // x8
    unsigned long long ptr;  // x25
    unsigned long long v10;  // x24
    unsigned long long v11;  // x8
    long long v12;  // x0
    unsigned long long v0;  // [bp-0xc8]
    unsigned long long v1;  // [bp-0xc0], Other Possible Types: long long
    unsigned long long v2;  // [bp-0xb8]
    char v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a2->field_188)
    {
        sub_b71bb0(&v3);
        v8 = v3;
        ptr = v4;
        v10 = v5;
        if (v8 != 0x8000000000000000)
        {
            if (v8 == 9223372036854775809)
            {
                a0->field_8 = v4;
                a0->field_10 = v10;
                a0->field_0 = 0x8000000000000000;
                return;
            }
            goto LABEL_c4ab38;
        }
        if (v10)
        {
            ptr = _malloc(v10);
            if (ptr)
            {
                _memcpy();
                v8 = v10;
            }
            else
            {
                v12 = sub_c6b970(1, v10);
                if (v10 & 0x7fffffffffffffff)
                    _free(a4);
                if (v0)
                    _free(v1);
                __Unwind_Resume(v12);
            }
LABEL_c4ab38:
            v0 = v8;
            v1 = ptr;
            v2 = v10;
            v11 = a3[6];
            if (a3[6])
                goto LABEL_c4ab48;
        }
        else
        {
            v0 = 0;
            v1 = 1;
            v2 = 0;
            v11 = a3[6];
            if (a3[6])
            {
LABEL_c4ab48:
                if (5 > a4->field_102)
                {
                    if ((unsigned long long)*(long long *)&a4->padding_80[0] > v11 - 1)
                        goto *((void *)(sub_c4ab8c + (&g_e06e94)[*(long long *)((char *)&a4->field_78[3 * v11].field_0 - 24)] * 4));
                }
                else
                {
                    if ((unsigned long long)*(long long *)&a4->padding_80[0] > v11)
                        goto *((void *)(sub_c4abd4 + (&g_e06e66)[*(long long *)&a4->field_78[3 * v11]] * 4));
                }
            }
        }
    }
    else
    {
        v0 = 0;
        v1 = 1;
        v2 = 0;
        v11 = a3[6];
        if (a3[6])
            goto LABEL_c4ab48;
    }
    goto *((void *)(sub_c4ace4 + (&g_e06ec2)[*a3] * 4));
}
