/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998344..0x99842c (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_998344_0 {
    char padding_0[4];
    unsigned int field_4;
    long long field_8;
} st_998344_0;


int sub_998344(long long a0, st_998344_0 *a1)
{
    long long v3;  // x19
    unsigned int v4;  // w8
    long long v5;  // x2
    char v0;  // [bp-0x21]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v4 = a1->field_4 - 21;
    if (3 <= v4)
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 1097, "tls13_common_post_process_record");
        v5 = 443;
    }
    else if (*(long long *)(v3 + 4384))
    {
        v0 = a1->field_4;
        (*(long long *)(v3 + 4384))();
    }
    else
    {
        if (1 < v4 || a1->field_8)
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls_common.c", 1114, "tls13_common_post_process_record");
        v5 = 271;
    }
    sub_996e84(v3, 10, v5, 0);
    return 0;
}
