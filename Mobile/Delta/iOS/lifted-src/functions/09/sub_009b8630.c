/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b8630..0x9b86f8 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b8630_1 {
    char padding_0[2];
    unsigned short field_2;
    unsigned short field_4;
} st_9b8630_1;

typedef struct st_9b8630_0 {
    char padding_0[624];
    struct st_9b8630_1 *field_270;
    unsigned long long field_278;
} st_9b8630_0;

typedef struct st_9b8630_2 {
    char padding_0[1244];
    unsigned int field_4dc;
} st_9b8630_2;

extern long long g_d28b1c;

void sub_9b8630(st_9b8630_2 *a0, st_9b8630_0 *a1)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // x22
    long long v17;  // x20
    long long v19;  // x8
    unsigned int v20;  // x8
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned short *v13;  // x21
    unsigned long v14;  // x9
    unsigned long v15;  // x22
    unsigned long v16;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = a1->field_278;
    if (v7 < 4)
    {
        return;
    }
    else if ((v7 >> 1 & 0x7fffffffffffffff) != 2)
    {
        v0 = v8;
        v1 = v9;
        v2 = v10;
        v3 = v11;
        v4 = &v6;
        v5 = v12;
        v13 = a1->field_270;
        v14 = v13[2];
        v15 = (unsigned int)((v14 & 0xff00) >> 8) | (unsigned int)v14 * 0x100 & 0xff00ff00;
        v16 = v7 - 6;
        v17 = v16 - v15;
        if (v16 < v15 || v13[1] & 0xff00 || v13[1] * 0x100 & 0xff00ff00)
            return;
        if ((sub_962a34() & 0xffffff00) == 0x300)
        {
            v19 = 18;
            if (770 < (int)sub_962a34(a0))
                v19 = 0x22;
            if (v17 == v19)
                goto LABEL_9b86c4;
LABEL_9b86b0:
            v20 = 0;
        }
        else
        {
            if (v17 != 18)
                goto LABEL_9b86b0;
LABEL_9b86c4:
            v20 = !sub_a66f20((char *)v13 + v15 + 6, &g_d28b1c, v17);
        }
        *(char *)&a0->field_4dc = v20;
        return;
    }
    else
    {
        return;
    }
}
