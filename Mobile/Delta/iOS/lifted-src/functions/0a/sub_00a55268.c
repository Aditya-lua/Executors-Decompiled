/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55268..0xa55768 (1280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a55268_0 {
    char padding_0[16];
    struct st_a55268_1 *field_10;
    unsigned long long field_18;
} st_a55268_0;

typedef struct st_a55268_1 {
    unsigned int field_0;
} st_a55268_1;

typedef struct st_a55268_2 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[8];
    struct st_a55268_2 *field_10;
    unsigned long long field_18;
    long long field_20;
    unsigned int field_28;
} st_a55268_2;

extern char g_a553a4;
extern char g_def307;

int sub_a55268(unsigned int a0, st_a55268_0 *a1, unsigned long long a2)
{
    unsigned int *v15;  // x23
    st_a55268_2 *v16;  // x0
    st_a55268_2 *v17;  // x0
    st_a55268_2 *v18;  // x11
    unsigned long i;  // x7
    unsigned int v20;  // w8
    unsigned long long v21;  // 4102
    st_a55268_2 *v22;  // x20
    unsigned long long v0;  // [bp-0xc8]
    st_a55268_2 *v1;  // [bp-0xc0]
    unsigned long v2;  // [bp-0xb8]
    unsigned long v3;  // [bp-0xb0]
    unsigned long v4;  // [bp-0xa8]
    unsigned long v5;  // [bp-0xa0]
    unsigned long v6;  // [bp-0x98]
    unsigned long v7;  // [bp-0x90]
    unsigned long v8;  // [bp-0x88]
    unsigned long v9;  // [bp-0x80]
    unsigned long v10;  // [bp-0x78]
    unsigned long v11;  // [bp-0x70]
    st_a55268_2 *v12;  // [bp-0x68]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = a1->field_10;
    v16 = sub_a6bffc(0x100, "crypto/evp/keymgmt_meth.c", 0x22);
    if (v16)
    {
        /* unsupported instruction */;
        v16->field_28 = 1;
        v16->field_4 = a0;
        v1 = v16;
        v17 = sub_a6895c(a1);
        v18 = v1;
        v18->field_10 = v17;
        if (v17)
        {
            v0 = a2;
            v12 = (st_a55268_2 *)0;
            v18->field_18 = a1->field_18;
            v10 = &v18[5].padding_8[4];
            v11 = (char *)&v18[5].field_10 + 4;
            v8 = &v18[4].field_28;
            v9 = &v18[5].field_4;
            v6 = &v18[4].field_18;
            v7 = &v18[4].field_20;
            v4 = (char *)&v18[1].field_20 + 4;
            v5 = v18 + 2;
            v2 = (char *)&v18[1].field_10 + 4;
            v3 = (char *)&v18[1].field_18 + 4;
            for (i = v15 + 2; 46 < (unsigned int)*(int *)(i - 8); i += 16);
            goto *((void *)(&(&g_a553a4)[4 * (&g_def307)[*(int *)(i - 8)]]));
        }
        else
        {
            do
            {
                /* unsupported instruction */;
                v20 = /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v21 = arm64g_calculate_condition(19, v20, 1, 0);
            if (!(v21 & 1))
            {
                /* unsupported instruction */;
            }
            else if (1 < (int)v20)
            {
                goto LABEL_a55744;
            }
            v22 = v18;
            sub_a6c2e4(v18->field_10, "crypto/evp/keymgmt_meth.c", 304);
            sub_a78ccc(v22->field_20);
            sub_a6c2e4(v22, "crypto/evp/keymgmt_meth.c", 307);
LABEL_a55744:
            v16 = 0;
        }
    }
    return (unsigned int)v16;
}
