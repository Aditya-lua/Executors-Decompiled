/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x995b38..0x995c30 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_995b38_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned long long field_8;
} st_995b38_0;


long long sub_995b38(long long a0, st_995b38_0 *a1)
{
    long long v2;  // x19
    long long v4;  // x1
    long long v5;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    switch (a1->field_4)
    {
    case 23:
LABEL_995ba0:
        if (a1->field_0 != 0x303)
        {
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tls13_meth.c", 268, "tls13_validate_record_header");
            v4 = 50;
            v5 = 267;
            break;
        }
        else if (a1->field_8 >= 16641)
        {
            sub_a368c8();
            sub_a369bc("ssl/record/methods/tls13_meth.c", 274, "tls13_validate_record_header");
            v4 = 22;
            v5 = 150;
            break;
        }
        else
        {
            return 1;
        }
    case 21:
        if (!*(int *)(v2 + 4304))
            goto LABEL_995b6c;
        else
            goto LABEL_995ba0;
    case 20:
        if (*(int *)(v2 + 4168))
            goto LABEL_995ba0;
        else
            goto LABEL_995b6c;
    default:
LABEL_995b6c:
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls13_meth.c", 263, "tls13_validate_record_header");
        v4 = 10;
        v5 = 443;
        break;
    }
    sub_996e84(v2, v4, v5, 0);
    return 0;
}
