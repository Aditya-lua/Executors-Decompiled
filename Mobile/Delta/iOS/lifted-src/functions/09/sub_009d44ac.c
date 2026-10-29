/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d44ac..0x9d46dc (560 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d44ac_0 {
    unsigned long long field_0;
    struct st_9d44ac_0 *field_8;
    struct st_9d44ac_0 *field_10;
    struct st_9d44ac_0 *field_18;
    char padding_20[8];
    struct st_9d44ac_0 *field_28;
    char padding_30[56];
    struct st_9d44ac_0 *field_68;
} st_9d44ac_0;


st_9d44ac_0 * sub_9d44ac(st_9d44ac_0 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, st_9d44ac_0 **a5)
{
    st_9d44ac_0 *v7;  // x8
    long long v8;  // x1
    unsigned long long v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    st_9d44ac_0 **v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (!a0)
    {
        *a5 = 0;
        sub_a368c8();
        sub_a369bc("crypto/bio/bio_lib.c", 446, "BIO_recvmmsg");
        v8 = 786690;
    }
    else if (a0->field_8 && a0->field_8->field_68)
    {
        v7 = a0->field_18;
        if (a0->field_10)
        {
            v0 = a1;
            v1 = a2;
            v2 = a3;
            v3 = a4;
            v4 = a5;
            if (v7)
                v7();
            a0->field_10();
        }
        else if (v7)
        {
            v0 = a1;
            v1 = a2;
            v2 = a3;
            v3 = a4;
            v4 = a5;
            v7();
        }
        else if ((int)a0->field_28)
        {
            a0->field_8->field_68();
        }
        else
        {
            *a5 = 0;
            sub_a368c8();
            sub_a369bc("crypto/bio/bio_lib.c", 471, "BIO_recvmmsg");
            v8 = 120;
        }
    }
    else
    {
        *a5 = 0;
        sub_a368c8();
        sub_a369bc("crypto/bio/bio_lib.c", 452, "BIO_recvmmsg");
        v8 = 121;
    }
    sub_a36abc(32, v8, 0);
    return 0;
}
