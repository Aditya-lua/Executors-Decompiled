/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ce04..0xa3cefc (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ce04_0 {
    char padding_0[28];
    unsigned int field_1c;
    long long field_20;
} st_a3ce04_0;


long long sub_a3ce04(unsigned long a0, unsigned long a1, st_a3ce04_0 *a2)
{
    long long v2;  // x22
    unsigned int v3;  // w0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2->field_20;
    a2->field_20 = 0;
    sub_a5b018(v2);
    switch (v3)
    {
    case 408:
        if (sub_9ffdd0(sub_a59bc4(v2)) && sub_a1abcc())
        {
            v4 = sub_a4ab5c();
            a2->field_20 = v4;
            if (v4)
                a2->field_1c = _strlen(v4);
        }
        else
        {
LABEL_a3ced0:
            if (a2->field_20)
                a2->field_1c = _strlen(a2->field_20);
        }
    case 28:
        if (!sub_9fec10(sub_a5af48(v2)))
            goto LABEL_a3ced0;
        v4 = sub_a2d030(sub_a60658());
        a2->field_20 = v4;
        if (v4)
            a2->field_1c = _strlen(v4);
        break;
    default:
        sub_a368c8();
        sub_a369bc("crypto/evp/ctrl_params_translate.c", 1546, "get_payload_group_name");
        sub_a36abc(6, 224, 0);
        return 0;
    }
    return 1;
}
