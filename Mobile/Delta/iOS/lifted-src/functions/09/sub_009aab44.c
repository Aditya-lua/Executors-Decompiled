/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9aab44..0x9aabf4 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9aab44_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_9aab44_2;

typedef struct st_9aab44_0 {
    char padding_0[28];
    char field_1c;
} st_9aab44_0;

typedef struct st_9aab44_1 {
    char padding_0[768];
    struct st_9aab44_0 *field_300;
} st_9aab44_1;


char sub_9aab44(st_9aab44_1 *a0, st_9aab44_2 *a1)
{
    st_9aab44_1 *v2;  // x19
    long long v3;  // x1
    long long v4;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1->field_8)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 3015, "tls_process_server_done");
        v3 = 50;
        v4 = 159;
    }
    else if (v2->field_300->field_1c >> 5 & 1 && (int)sub_971220(v2) <= 0)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 3021, "tls_process_server_done");
        v3 = 80;
        v4 = 361;
    }
    sub_9a58a4(v2, v3, v4, 0);
    return 0;
}
