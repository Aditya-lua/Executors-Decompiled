/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99b1e4..0x99b3fc (536 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99b1e4_0 {
    char padding_0[120];
    unsigned int field_78;
    char padding_7c[2052];
    unsigned long long field_880;
} st_99b1e4_0;

typedef struct st_99b1e4_2 {
    unsigned long long field_0;
} st_99b1e4_2;

typedef struct st_99b1e4_1 {
    struct st_99b1e4_2 *field_0;
    unsigned int field_4;
} st_99b1e4_1;

extern st_99b1e4_1 g_e88ec8;

unsigned long long sub_99b1e4(st_99b1e4_0 *a0, long long a1, unsigned long long a2, long long a3, long long a4)
{
    st_99b1e4_0 *v5;  // x19
    unsigned int v6;  // w24
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    st_99b1e4_1 *v9;  // x26
    unsigned long long v10;  // x27
    unsigned long long v11;  // x8
    unsigned int v12;  // w0
    long long v13;  // x1
    unsigned int v0;  // [bp-0x6c]
    unsigned int v1;  // [bp-0x68]
    char v2;  // [bp-0x64]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0;
    v1 = 0;
    v6 = (unsigned int)a2 & 0x8000;
    if (sub_c6876c(a1, 2) && (!((unsigned int)a2 & 384) || sub_c689f4(a1, 2)))
    {
        if (!(a2 >> 7 & 1))
            goto LABEL_99b30c;
        v7 = sub_9ae540(v5, &v2, &v1, 0);
        if ((unsigned int)v7)
        {
            if (!v6)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions.c", 829, "tls_construct_extensions");
LABEL_99b284:
                sub_9a58a4(v5, 80, v7, 0);
            }
        }
        else
        {
            sub_9a0728(v5->field_880 + 128);
LABEL_99b30c:
            v8 = sub_9a093c(v5, a2, a1, a3, a4);
            if (!(unsigned int)v8)
                return v8;
            v0 = v6;
            v9 = &g_e88ec8.field_0;
            v10 = 2544;
            do
            {
                if (sub_99b118(v5, *(int *)((char *)&v9->field_0 + 4), a2, v1))
                {
                    if (!v5->field_78)
                        v11 = 40;
                    else
                        v11 = 32;
                    if (*(long long *)((char *)v9 + v11))
                        (*(long long *)((char *)v9 + v11))();
                }
            } while ((v9 = &v9[4].field_4, v10 += 1, v10 != 2573));
            v12 = sub_a6e970(a1);
            if (v12 || v0)
                return v12 != 0;
            sub_a368c8(v12 != 0);
            v13 = 872;
LABEL_99b270:
            sub_a369bc("ssl/statem/extensions.c", v13, "tls_construct_extensions");
            v7 = 786691;
            goto LABEL_99b284;
        }
    }
    else if (!v6)
    {
        sub_a368c8();
        v13 = 821;
        goto LABEL_99b270;
    }
    return 0;
}
