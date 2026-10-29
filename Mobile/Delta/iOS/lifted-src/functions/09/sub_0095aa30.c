/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95aa30..0x95b8e4 (3764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95aa30_3 {
    char padding_0[8];
    struct st_95aa30_1 *field_8;
    char padding_10[1688];
    unsigned int field_6a8;
    unsigned int field_6ac;
} st_95aa30_3;

typedef struct st_95aa30_1 {
    char padding_0[192];
    struct st_95aa30_2 *field_c0;
    char padding_c8[16];
    struct st_95aa30_0 *field_d8;
} st_95aa30_1;

typedef struct st_95aa30_4 {
    char padding_0[28];
    unsigned int field_1c;
} st_95aa30_4;

typedef struct st_95aa30_0 {
    char padding_0[80];
    char field_50;
} st_95aa30_0;

typedef struct st_95aa30_2 {
    unsigned long long field_0;
} st_95aa30_2;


char sub_95aa30(st_95aa30_3 *a0, unsigned long a1, char a2, unsigned long long a3, char a4, st_95aa30_4 *a5)
{
    st_95aa30_1 *v6;  // x19
    unsigned int v7;  // w8
    unsigned long long v0;  // [bp-0x88]
    unsigned long long v1;  // [bp-0x80]
    unsigned int v2;  // [bp-0x78]
    unsigned int v3;  // [bp-0x74]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (!a3)
    {
        return 0;
    }
    else if (!a2)
    {
        return 0;
    }
    else if (a4)
    {
        v0 = a2;
        v1 = a3;
        v6 = a0->field_8;
        if (_strncmp(a4, "SUITEB128ONLY", 13))
        {
            if (!_strncmp(a4, "SUITEB128C2", 11))
            {
                v7 = 0x30000;
                goto LABEL_95ab1c;
            }
            if (!_strncmp(a4, "SUITEB128", 9))
            {
                v7 = 0x30000;
            }
            else if (!_strncmp(a4, "SUITEB192", 9))
            {
                v7 = 0x20000;
            }
            else if (a5->field_1c & 0x30000)
            {
                goto LABEL_95ab2c;
            }
            else
            {
                v2 = a0->field_6ac;
                v3 = a0->field_6a8;
                v6->field_c0();
            }
        }
        else
        {
            v7 = 0x10000;
        }
LABEL_95ab1c:
        a5->field_1c = a5->field_1c & 0xfffcffff | v7;
LABEL_95ab2c:
        if (!(v6->field_d8->field_50 >> 4 & 1))
        {
            sub_a368c8();
            sub_a369bc("ssl/ssl_ciph.c", 1240, "check_suiteb_cipher_list");
            sub_a36abc(20, 158, 0);
            return 0;
        }
        switch (v7)
        {
        case 65536:
            break;
        case 131072:
            break;
        case 196608:
            break;
        default:
            goto LABEL_95ab9c;
        }
LABEL_95ab9c:
        v2 = a0->field_6ac;
        v3 = a0->field_6a8;
        v6->field_c0();
    }
    else
    {
        return 0;
    }
}
