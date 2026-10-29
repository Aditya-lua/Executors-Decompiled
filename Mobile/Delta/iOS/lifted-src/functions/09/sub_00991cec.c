/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991cec..0x991e20 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991cec_0 {
    unsigned int field_0;
    char padding_4[140];
    struct st_991cec_1 *field_90;
} st_991cec_0;

typedef struct st_991cec_3 {
    char padding_0[24];
    struct st_991cec_0 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[376];
    int field_1c4;
    char padding_1c8[2040];
    unsigned int field_9c0;
    char padding_9c4[692];
    struct st_991cec_2 *field_c78;
} st_991cec_3;

typedef struct st_991cec_2 {
    char padding_0[48];
    struct st_991cec_1 *field_30;
} st_991cec_2;

typedef struct st_991cec_1 {
    unsigned long long field_0;
} st_991cec_1;


unsigned long long sub_991cec(st_991cec_3 *a0, char a1, unsigned long long a2, unsigned long long a3, unsigned long a4)
{
    unsigned int v6;  // w8
    char v0;  // [bp-0x58]
    unsigned int v1;  // [bp-0x54]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (a0->field_1c4 >= 1)
    {
        a0->field_18->field_90();
    }
    else if (a3)
    {
        if (a3 > (sub_963ccc(a0) & 0xffffffff))
        {
            sub_a368c8();
            sub_a369bc("ssl/record/rec_layer_d1.c", 645, "do_dtls1_write");
            sub_9a58a4(a0, 80, 194, 0);
            return 0;
        }
        v0 = a1;
        if (a0->field_18->field_0 != 0x1ffff || a0->field_9c0 == 0x100)
            v6 = a0->field_48;
        else
            v6 = 0xfeff;
        v1 = v6;
        v2 = a2;
        v3 = a3;
        a0->field_c78->field_30();
    }
    else
    {
        return 0;
    }
}
