/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ab924..0x9abc2c (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ab924_1 {
    char padding_0[176];
    struct st_9ab924_2 *field_b0;
    char padding_b8[32];
    struct st_9ab924_0 *field_d8;
} st_9ab924_1;

typedef struct st_9ab924_3 {
    char padding_0[24];
    struct st_9ab924_1 *field_18;
    char padding_20[2456];
    unsigned int field_9b8;
    int field_9bc;
    char padding_9c0[480];
    unsigned int field_ba0;
} st_9ab924_3;

typedef struct st_9ab924_0 {
    char padding_0[80];
    char field_50;
} st_9ab924_0;

typedef struct st_9ab924_2 {
    unsigned long long field_0;
} st_9ab924_2;


char sub_9ab924(st_9ab924_3 *a0, char a1, unsigned long a2)
{
    char v2;  // w25
    char v3;  // x8
    char v4;  // x10
    char v5;  // w28
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_ba0 && !(a0->field_18->field_d8->field_50 >> 3 & 1) && sub_959e54(a0, 9, 0, 769, 0))
        v2 = 770 > a0->field_9bc;
    else
        v2 = 0;
    if (!sub_96a01c(a0))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 0x1025, "ssl_cipher_list_to_bytes");
        goto LABEL_9abbc8;
    }
    else if (a1)
    {
        v3 = 0xfffe;
        if (v2)
            v3 = 0xfffc;
        v4 = v3 - 2;
        if (a0->field_9b8 & 128)
            v3 = v4;
        if ((int)sub_ad69e4() >= 1)
        {
            v5 = 1;
            do
            {
                if (!sub_96a23c(a0, sub_ad69f8(a1, v5 - 1), 0x10001, 0))
                    a0->field_18->field_b0();
            } while ((int)sub_ad69e4(a1) > v5 && (v5 += 1, 0 < v3));
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 0x1062, "ssl_cipher_list_to_bytes");
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 0x102a, "ssl_cipher_list_to_bytes");
LABEL_9abbc8:
    }
    sub_9a58a4();
    return 0;
}
