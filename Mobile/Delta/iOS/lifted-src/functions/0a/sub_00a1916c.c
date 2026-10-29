/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1916c..0xa19308 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1916c_1 {
    char padding_0[24];
    struct st_a1916c_0 *field_18;
} st_a1916c_1;

typedef struct st_a1916c_0 {
    char padding_0[64];
    long long field_40;
} st_a1916c_0;


unsigned long long sub_a1916c(st_a1916c_1 *a0, long long a1)
{
    long long v2;  // x19
    long long v3;  // x20
    long long v4;  // x21
    unsigned long long v5;  // x0
    unsigned long long v6;  // x20
    unsigned int v7;  // w22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 786690;
    if (!a0 || !a0->field_18 || !*(long long *)&a0[1].padding_0[0])
    {
        v3 = 480;
    }
    else if (sub_a1b4f4(a0->field_18, *(long long *)&a0[1].padding_0[0]))
    {
        v2 = 106;
        v3 = 486;
    }
    else
    {
        sub_9de064(a1);
        v4 = sub_9de208(a1);
        v5 = sub_9de208(a1);
        if (!v5 || (v6 = v5, !sub_a1b3cc(a0->field_18, *(long long *)&a0[1].padding_0[0], v4, v6, a1)))
        {
LABEL_a192c4:
            sub_9de17c(a1);
            v2 = 146;
            v3 = 492;
        }
        else if (sub_a1abd4(a0->field_18) == 406)
        {
            if (!sub_9e5c94(v4) && sub_9e5528(v4, a0->field_18->field_40) >> 31 & 1 && !sub_9e5c94(v6) && sub_9e5528(v6, a0->field_18->field_40) >> 31 & 1)
                goto LABEL_a192d8;
            goto LABEL_a192c4;
        }
        else
        {
            v7 = sub_a1ad1c(a0->field_18);
            if ((int)v7 < (int)sub_9e46a8(v4) || (int)sub_9e46a8(v6) > (int)v7)
                goto LABEL_a192c4;
LABEL_a192d8:
            sub_9de17c(a1);
            if ((int)sub_a1b328(a0->field_18, *(long long *)&a0[1].padding_0[0], a1) > 0)
                return 1;
            v2 = 107;
            v3 = 498;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_key.c", v3, "ossl_ec_key_public_check_quick");
    sub_a36abc(16, v2, 0);
    return 0;
}
