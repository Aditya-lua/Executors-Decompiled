/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb12264..0xb12604 (928 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b12264_1 {
    char field_0;
    char field_1;
} st_b12264_1;

typedef struct st_b12264_3 {
    long long field_0;
    char padding_8[256];
    struct st_b12264_0 *field_108;
    unsigned long long field_110;
} st_b12264_3;

typedef struct st_b12264_2 {
    unsigned long long field_0;
} st_b12264_2;

typedef struct st_b12264_0 {
    struct st_b12264_1 *field_0;
    char padding_8[20];
    unsigned int field_1c;
    struct st_b12264_2 *field_20;
    unsigned long long field_28;
    struct st_b12264_2 *field_30;
    struct st_b12264_2 *field_38;
    struct st_b12264_2 *field_40;
    char padding_48[16];
    struct st_b12264_2 *field_58;
} st_b12264_0;

extern char g_10002b0;

unsigned long long sub_b12264(st_b12264_3 *a0, unsigned long a1, unsigned long long a2, unsigned long long *a3, unsigned long a4)
{
    unsigned long v20;  // x23
    st_b12264_0 *v21;  // x9
    unsigned long long v4;  // [bp-0x108]
    unsigned long long v5;  // [bp-0x100]
    unsigned long long v6;  // [bp-0xf8]
    unsigned long long v7;  // [bp-0xf0]
    unsigned long v17;  // [bp-0x48]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v17 = *(long long *)&g_10002b0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    *(unsigned int *)&a0->field_110 = a2;
    if (!a2)
        v20 = a0->field_108->field_1c;
    else
        v20 = a2;
    if (a0->field_108->field_1c & (unsigned int)v20)
    {
        if (sub_b26dd8(a0->field_0))
        {
            sub_a36c8c();
            if (v20 & 1)
            {
                v6 = v7;
                v21 = a0->field_108;
                if (v21->field_38)
                    v21->field_38();
                if (v21->field_20)
                    v21->field_20();
                if ((int)a0->field_110)
                    goto LABEL_b12460;
            }
            if (!(v20 >> 1 & 1))
            {
LABEL_b122dc:
                if ((unsigned int)v20 & 132)
                {
                    v6 = v7;
                    if (a0->field_108->field_30)
                        a0->field_108->field_30();
                }
            }
            else
            {
                v6 = v7;
                if (a0->field_108->field_40)
                    a0->field_108->field_40();
                if (a0->field_108->field_28)
                    a0->field_108->field_28();
                if (!(int)a0->field_110)
                    goto LABEL_b122dc;
            }
LABEL_b12460:
            sub_a36e70();
        }
        sub_a6c2e4(v7, "providers/implementations/encode_decode/decode_der2key.c", 339);
        v7 = 0;
        a0->field_108->field_58();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/decode_der2key.c", 258, "der2key_decode");
        sub_a36abc(57, 0x80106, 0);
        if (*(long long *)&g_10002b0 == v17)
            return 0;
        ___stack_chk_fail();
    }
}
