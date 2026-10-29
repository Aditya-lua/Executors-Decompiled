/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa19308..0xa1941c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a19308_0 {
    char padding_0[16];
    long long field_10;
} st_a19308_0;

typedef struct st_a19308_1 {
    char padding_0[24];
    struct st_a19308_0 *field_18;
    long long field_20;
} st_a19308_1;


unsigned long long sub_a19308(st_a19308_1 *a0, long long a1)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x19
    long long v6;  // x20
    long long v7;  // x21
    unsigned long long v8;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd0(a0->field_18);
    v3 = sub_a1916c(a0, a1);
    if (!(unsigned int)v3)
        return v3;
    if (v2 && sub_9e5b90(v2))
        return 1;
    v4 = sub_a1a56c(a0->field_18);
    if (!v4)
        return v4;
    v5 = v4;
    if (sub_9e4828(a0->field_18->field_10))
    {
        v6 = 122;
        v7 = 529;
        goto LABEL_a19380;
    }
    if (!sub_a1b804(a0->field_18, v5, 0, a0->field_20, a0->field_18->field_10, a1))
    {
        v6 = 524304;
        v7 = 534;
        goto LABEL_a19380;
    }
    else if (sub_a1b4f4(a0->field_18, v5))
    {
        v8 = 1;
    }
    else
    {
        v6 = 130;
        v7 = 538;
LABEL_a19380:
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_key.c", v7, "ossl_ec_key_public_check");
        sub_a36abc(16, v6, 0);
        v8 = 0;
    }
    sub_a1a254(v5);
    return v8;
}
