/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98ab34..0x98ad88 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98ab34_0 {
    char padding_0[8];
    struct st_98ab34_1 *field_8;
    char padding_10[88];
    struct st_98ab34_1 *field_68;
    char padding_70[56];
    char field_a8;
} st_98ab34_0;

typedef struct st_98ab34_1 {
    unsigned long long field_0;
} st_98ab34_1;

typedef struct st_98ab34_2 {
    struct st_98ab34_0 *field_0;
    struct st_98ab34_1 *field_8;
    long long field_10;
    char padding_18[32];
    unsigned int field_38;
    char padding_3c[20];
    struct st_98ab34_1 *field_50;
} st_98ab34_2;


unsigned int sub_98ab34(st_98ab34_2 *a0, void* a1, unsigned long a2)
{
    char v5;  // x9
    unsigned long v6;  // x9
    unsigned long v7;  // x9
    unsigned int v8;  // w8
    long long v9;  // x1
    char v0;  // [bp-0x28], Other Possible Types: unsigned int
    unsigned short v1;  // [bp-0x27]
    unsigned short v2;  // [bp-0x25]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a2 != 1)
    {
        sub_c636b4(a0, &v0);
        return v0;
    }
    sub_9d3d58(a0->field_10, 15);
    if (a0->field_50)
    {
        if ((int)a0->field_8)
            v5 = 23;
        else
            v5 = *(char *)a1;
        v0 = v5;
        v6 = (short)a1[4];
        v1 = (((((v6 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v6 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v6 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v6 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
        v7 = (short)a1[16];
        v2 = (((((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v7 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v7 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
        a0->field_50();
    }
    else
    {
        v8 = *(char *)a1;
        if (v8 != 22)
        {
            if (v8 != 21)
            {
                a0->field_38 = 80;
                sub_a368c8();
                sub_a369bc("ssl/quic/quic_tls.c", 352, "quic_write_records");
                v9 = 786691;
            }
            else if ((long long)a1[16] == 2)
            {
                a0->field_0->field_68();
            }
            else
            {
                a0->field_38 = 80;
                sub_a368c8();
                sub_a369bc("ssl/quic/quic_tls.c", 298, "quic_write_records");
                v9 = 384;
            }
            sub_a36abc(20, v9, 0);
            a0->field_0->field_a8 = a0->field_0->field_a8 | 2;
            return 0xfffffffe;
        }
        a0->field_0->field_8();
    }
}
